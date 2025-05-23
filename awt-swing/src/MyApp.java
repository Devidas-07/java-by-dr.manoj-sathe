import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MyApp extends Frame{
	Label lblTitle,lblName,lblFather,lblAge,lblGender,lblCourse,lblHobbies,lblAddress;
    TextField txtName,txtFather,txtAge;
    TextArea txtAddress;
    Checkbox checkMale, checkFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
    CheckboxGroup cbg;
    Choice Course;
    Button btnSave,btnClear;
	public MyApp() {
		 super("User Registration Form");
	        setSize(1000, 600);// w,h
	        setLayout(null);
	        setVisible(true);
	        
	        lblTitle=new Label("User Registration new Form");
	        lblTitle.setBounds(450,40,300,50);

	        add(lblTitle);

	        lblName=new Label("Name");
	        lblName.setBounds(250,100,150,30);

	        add(lblName);
	        txtName=new TextField();
	        txtName.setBounds(400,100,400,30);

	        add(txtName);

	        lblFather=new Label("Father Name");
	        lblFather.setBounds(250,150,150,30);

	        add(lblFather);

	        txtFather=new TextField();
	        txtFather.setBounds(400,150,400,30);

	        add(txtFather);

	        lblAge=new Label("Age");
	        lblAge.setBounds(250,200,150,30);

	        add(lblAge);

	        txtAge=new TextField();
	        txtAge.setBounds(400,200,400,30);
	       
	        add(txtAge);


	        lblGender=new Label("Gender");
	        lblGender.setBounds(250,250,150,30);

	        add(lblGender);

	        cbg = new CheckboxGroup();
	        checkMale = new Checkbox("Male",cbg,true); 
	        checkMale.setBounds(400,250, 100, 30);

	        add(checkMale);

	        checkFemale = new Checkbox("Female",cbg,false); //Radio Button1
	        checkFemale.setBounds(500,250, 100, 30);

	        add(checkFemale);

	        lblCourse=new Label("Course");
	        lblCourse.setBounds(250,300,150,30);

	        add(lblCourse);

	        Course= new Choice(); //Drop Down List

	        Course.setBounds(400, 300, 400, 50);
	        Course.add("C");
	        Course.add("C++");
	        Course.add("Java");
	        Course.add("C#");
	        Course.add("Python");
	        add(Course);

	        lblHobbies=new Label("Hobbies");
	        lblHobbies.setBounds(250,350,150,30);

	        add(lblHobbies);

	        Hobbies1=new Checkbox("Drawing"); //CheckBox1
	        Hobbies1.setBounds(400, 350, 100, 50);

	        add(Hobbies1);

	        Hobbies2=new Checkbox("Singing"); //CheckBox2
	        Hobbies2.setBounds(500, 350, 100, 50);

	        add(Hobbies2);

	        Hobbies3=new Checkbox("Music"); //CheckBox3
	        Hobbies3.setBounds(600, 350, 100, 50);

	        add(Hobbies3);

	        Hobbies4=new Checkbox("Others"); //CheckBox4
	        Hobbies4.setBounds(700, 350, 100, 50);

	        add(Hobbies4);

	        lblAddress=new Label("Address");
	        lblAddress.setBounds(250,400,150,30);

	        add(lblAddress);

	        txtAddress=new TextArea(10,30); //TextArea for Address
	        txtAddress.setBounds(400,400,400,100);
	        
	        add(txtAddress);
	        btnSave=new Button("Save Details");
	        btnSave.setBounds(400,530,150,30);
	      
	        add(btnSave);

	        this.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent we) {
	                System.exit(0);
	            }
	        });
	}
	
}
