import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class AwtFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ui u = new Ui();

	}

}

class Ui extends Frame {
	Label title, name, password;
	TextField txtname, txtpass;
	Button btnSave, btnClear;
	public Ui() {
		super("my form");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		title = new Label("My Form");
		title.setBounds(450,40,300,50);
		add(title);
		
		
		
		name = new Label("Name");
		name.setBounds(250,100,150,30);
		add(name);
		
		txtname = new TextField();
		txtname.setBounds(400,100,400,30);
		add(txtname);
		txtpass = new TextField();
		add(txtpass);
		
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	}
}