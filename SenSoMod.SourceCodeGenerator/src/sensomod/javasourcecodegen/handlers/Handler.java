package sensomod.javasourcecodegen.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class Handler extends AbstractHandler {
	private boolean generateConstructors;
	private boolean generateSettersGetters;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		MessageBox messageDialog = new MessageBox(window.getShell(), SWT.ICON_QUESTION | SWT.YES | SWT.NO);
		messageDialog.setText("Please validate diagram");
		messageDialog.setMessage("Do you have validated the diagramm? (right click -> Validate diagram)");
		int returnCode = messageDialog.open();
		if (returnCode == SWT.YES) {

			SenSoModFileSelector fileDialog = new SenSoModFileSelector("SenSoMod File Selector", "Select *.senSoMod file from the projects.", new String[] {"sensomod"});
			
			returnCode = fileDialog.open();
			System.out.println(returnCode);
			if (returnCode == Window.OK) {
				Object result = fileDialog.getFirstResult();
				IPath selected = null;
				if ((result != null) && (result instanceof IResource)) {
					selected = ((IResource) result).getLocation();
				}
				System.out.println(selected);
	
				String selectedDir = createDirDialog(window);
				System.out.println(selectedDir);
				if(selected != null || !selectedDir.isEmpty()) {
					returnCode = createConfirmationDialog(window, selected, selectedDir);
					if(returnCode == Window.OK) {						
						SenSoMod2Java sensomod2java = new SenSoMod2Java();
						if (sensomod2java.transform(selected.toOSString(), selectedDir, generateConstructors, generateSettersGetters)) {
							MessageBox messageDialog2 = new MessageBox(window.getShell(), SWT.ICON_WORKING | SWT.OK);
							messageDialog2.setText("Finished");
							messageDialog2.setMessage("Java Files successfully generated in " + selectedDir);
							messageDialog2.open();
						} else {
							MessageBox messageDialog2 = new MessageBox(window.getShell(), SWT.ICON_ERROR | SWT.OK);
							messageDialog2.setText("ERROR");
							messageDialog2.setMessage("Could not generate Java Files!\nHave a look in the log file under " + selectedDir + "\n");
							messageDialog2.open();
						}					
					}
				}
			}
		}
		return null;
	}

	private int createConfirmationDialog(IWorkbenchWindow window, IPath selected, String selectedDir) {
		ConfirmationDialog confirmationDialog = new ConfirmationDialog(window.getShell(), selected.lastSegment(), selectedDir);
		int dialogValue = confirmationDialog.open();
		generateConstructors = confirmationDialog.getGenerateConstructors();
		generateSettersGetters = confirmationDialog.getGenerateGettersSetters();
		
		System.out.println("generate constructors: " + confirmationDialog.getGenerateConstructors());
		System.out.println("generate getters and setters: " + confirmationDialog.getGenerateGettersSetters());
		return dialogValue;
	}

	private String createDirDialog(IWorkbenchWindow window) {
		DirectoryDialog dirDialog = new DirectoryDialog(window.getShell());
		dirDialog.setText("Select directory where java source files should generated");
		String selectedDir = dirDialog.open();
		return selectedDir;
	}
}
