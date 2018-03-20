package sensomod.javasourcecodegen.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
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

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		MessageBox messageDialog = new MessageBox(window.getShell(), SWT.ICON_QUESTION | SWT.YES | SWT.NO);
		messageDialog.setText("Please validate diagram");
		messageDialog.setMessage("Do you have validated the diagramm? (right click -> Validate diagram)");
		int returnCode = messageDialog.open();
		System.out.println(returnCode);
		if (returnCode == 64) {

			FileDialog fileDialog = new FileDialog(window.getShell());
			fileDialog.setText("Select *.senSoMod File");
			fileDialog.setFilterExtensions(new String[] { "*.senSoMod" });
			fileDialog.setFilterNames(new String[] { "senSoMod(*.senSoMod)" });
			String selected = fileDialog.open();
			System.out.println(selected);

			DirectoryDialog dirDialog = new DirectoryDialog(window.getShell());
			dirDialog.setText("Select directory where java source files should generated");
			String selectedDir = dirDialog.open();
			System.out.println(selectedDir);

			messageDialog = new MessageBox(window.getShell(), SWT.ICON_QUESTION | SWT.OK | SWT.CANCEL);
			messageDialog.setText("Generate?");
			messageDialog.setMessage("Do you want generate Java files for\n" + selected + "\n into\n" + selectedDir);
			returnCode = messageDialog.open();
			if (returnCode == 32) {
				SenSoMod2Java sensomod2java = new SenSoMod2Java();
				if (sensomod2java.transform(selected, selectedDir)) {
					MessageBox messageDialog2 = new MessageBox(window.getShell(), SWT.ICON_WORKING | SWT.OK);
					messageDialog2.setText("Finished");
					messageDialog2.setMessage("Java Files successfully generated in " + selectedDir);
					messageDialog2.open();
				} else {
					MessageBox messageDialog2 = new MessageBox(window.getShell(), SWT.ICON_ERROR | SWT.OK);
					messageDialog2.setText("ERROR");
					messageDialog2.setMessage("Could not generate Java Files in " + selectedDir);
					messageDialog2.open();
				}
			}
		}
		return null;
	}
}
