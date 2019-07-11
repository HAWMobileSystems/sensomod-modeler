package sensomod.modelgenerator.handlers;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import sensomod.modelgenerator.helpers.ExtractInfosFromJavaClasses;

public class Handler extends AbstractHandler {
	
	private static final Logger LOG = Logger.getLogger(Handler.class.getName());

	/**
	 * Starting class for the GUI execution of the code to model generator.
	 * Creates a dialog to ask where the sensomod classes are to derive the model from
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String sourceCodeDir = getSenSoModClassPath(event);
		String targetDir = getTargetDirForTheSenSoModModell(event);
		LOG.log(Level.FINE, "path to source code is: " + sourceCodeDir);
		LOG.log(Level.FINE, "Path to target directory is: " + targetDir);
		
		if(sourceCodeDir != null && targetDir != null) {			
			ExtractInfosFromJavaClasses extractInfosFromJavaClasses = new ExtractInfosFromJavaClasses();
			extractInfosFromJavaClasses.analyzeClassesAndGenerateModel(new File(sourceCodeDir), new File(targetDir));
		}
		return null;
		
	}

	private String getTargetDirForTheSenSoModModell(ExecutionEvent event) throws ExecutionException {		   
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog ( HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider() );
	    dialog.setTitle("Target Directory" );
	    dialog.setMessage("Select folder where the SenSoMod-Model should be generated in:");
	    dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
	    dialog.setAllowMultiple(false);

	    	if (dialog.open () == IDialogConstants.OK_ID) {
	    		final IResource resource = (IResource) dialog.getFirstResult();
	    		resource.getFullPath().makeRelative().toOSString();
	    		resource.getLocation().toString();
	            if (resource != null) {
	            	resource.getWorkspace().getRoot().getFullPath();
	            	return resource.getLocation().toString();
	            }
	        }
		return null;
	}

	private String getSenSoModClassPath(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
	    DirectoryDialog dirDialog = new DirectoryDialog(window.getShell());
	    dirDialog.setText("Select directory where the java files lay from which the model can be derived:");
	    String targetDirString = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();	    
	    dirDialog.setFilterPath( targetDirString);
		return dirDialog.open();
	}
}
