package sensomod.javasourcecodegen.handlers;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * This class provides the confirmation Dialog.
 * 
 * @author Julian Dörndorfer
 *
 */
public class ConfirmationDialog extends TitleAreaDialog {

    private Button constructorCheck;
    private Button gettersSettersCheck;

    private boolean generateConstructors;
    private boolean generateGettersSetters;
    
    private String selectedModel;
    private String selectedDir;

    public ConfirmationDialog(Shell parentShell, String selectedModel, String selectedDir) {
        super(parentShell);
        this.selectedModel = selectedModel;
        this.selectedDir = selectedDir;
    }

    @Override
    public void create() {
        super.create();
        setTitle("Confirmation Dialog");
        setMessage("Check and confirm your settings to generate the source code.\n", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);
        
        createInformationText(container);
        createConstructorCheck(container);
        createGetterSetterCheck(container);

        return area;
    }

	private void createInformationText(Composite container) {
		GridData informationTextData = new GridData(GridData.FILL);
		informationTextData.horizontalSpan = 2;
		Label informationText = new Label(container, SWT.NONE);
		informationText.setText("TheJava files for the model \'" + selectedModel + "\' will be generate into the following directory:\n" + selectedDir + "\n");
		informationText.setLayoutData(informationTextData);
	}

	private void createConstructorCheck(Composite container) {
        Label labelConstructorCheck = new Label(container, SWT.NONE);
        labelConstructorCheck.setText("Should constructors be build for the generated classes?");

        GridData dataConstructorCheck = new GridData();
        dataConstructorCheck.grabExcessHorizontalSpace = true;
        dataConstructorCheck.horizontalAlignment = GridData.FILL;

        constructorCheck = new Button(container, SWT.CHECK);
        constructorCheck.setLayoutData(dataConstructorCheck);
    }

    private void createGetterSetterCheck(Composite container) {
        Label labelGetterSetterCheck = new Label(container, SWT.NONE);
        labelGetterSetterCheck.setText("Should getters and setters be build for the generated classes?");

        GridData dataGetterSetterCheck = new GridData();
        dataGetterSetterCheck.grabExcessHorizontalSpace = true;
        dataGetterSetterCheck.horizontalAlignment = GridData.FILL;
        gettersSettersCheck = new Button(container, SWT.CHECK);
        gettersSettersCheck.setLayoutData(dataGetterSetterCheck);
    }



    @Override
    protected boolean isResizable() {
        return true;
    }

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {
        generateConstructors = constructorCheck.getSelection();
        generateGettersSetters = gettersSettersCheck.getSelection();

    }

    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

    public boolean getGenerateConstructors() {
        return generateConstructors;
    }

    public boolean getGenerateGettersSetters() {
        return generateGettersSetters;
    }

}
