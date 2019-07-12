package sensomod.modelgenerator.handlers;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import sensomod.modelgenerator.helpers.ExtractInfosFromJavaClasses;

public class Handler extends AbstractHandler {
	
	private static final Logger LOG = Logger.getLogger(Handler.class.getName());
	private FileHandler fileHandler;

	/**
	 * Starting class for the GUI execution of the code to model generator.
	 * Creates a dialog to ask where the sensomod classes are to derive the model from
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String sourceCodeDir = getSenSoModClassPath(event);
		String targetDir = getTargetDirForTheSenSoModModell(event);
		Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
		createLogfile(targetDir);
		LOG.info("path to source code is: " + sourceCodeDir);
		LOG.info("Path to target directory is: " + targetDir);
		
		if(sourceCodeDir != null && targetDir != null) {			
			ExtractInfosFromJavaClasses extractInfosFromJavaClasses = new ExtractInfosFromJavaClasses(shell);
			if(extractInfosFromJavaClasses.analyzeClassesAndGenerateModel(new File(sourceCodeDir), new File(targetDir))) {
				showInfoDialog(targetDir, shell);
			} else {
				showErrorDialog(targetDir, shell);
			}
		}
		fileHandler.close();
		return null;
		
	}
	
	private void showErrorDialog(String targetDir, Shell shell) {
		MessageBox messageDialog = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
		messageDialog.setText("ERROR");
		messageDialog.setMessage("Could not generate the SenSoMod model!\nHave a look in the log file under " + targetDir + "\n");
		messageDialog.open();
	}
	
	private void showInfoDialog(String targetDir, Shell shell) {
		MessageBox messageDialog2 = new MessageBox(shell, SWT.ICON_WORKING | SWT.OK);
		messageDialog2.setText("Finished");
		messageDialog2.setMessage("The SenSoMod model has been successfully generated in " + targetDir);
		messageDialog2.open();
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
	
	/**
	 * This method creates the log file.
	 * @param targetDir targetPath for the logfile.
	 */
	private void createLogfile(String targetDir) {
		try {
			fileHandler = new FileHandler(targetDir + "/log.txt");
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
			LOG.addHandler(fileHandler);
			LOG.info("...Start Parsing .sensomod...");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
