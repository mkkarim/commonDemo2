package plugin1common;



import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.jface.dialogs.Dialog;


public class Plugin1CommonDialog extends Dialog{

	   public Plugin1CommonDialog(Shell parentShell) {
	        super(parentShell);
	    }

	    @Override
	    protected Control createDialogArea(Composite parent) {
	        Composite container = (Composite) super.createDialogArea(parent);
	        Label label = new Label(container, SWT.NONE);
	        label.setText("Je suis plugin 1 common v2");
	        return container;
	    }
}
