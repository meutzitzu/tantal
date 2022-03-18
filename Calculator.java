import javax.swing.*;



class Ui implements ActionListener 
{
	JFrame frame=new JFrame();
	JButton button=new JButton("Click Me");
	
	UVRM calc = new UVRM();

	Ui()
	{
		prepareGUI();
		buttonProperties();
	}

	public void prepareGUI()
	{
		frame.setTitle("shitty calculator");
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setBounds(200,200,400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField field = new JTextField(16);
		//field.setBounds(10, 10, 80, 40);
		frame.add(field);
	}
	
	public void addField( int btnx, int btny, int btnw, int btnh)
	{	
		JTextField field = new JTextField(16);
		field.setBounds(btnx, btny, btnw, btnh);
		frame.add(field);
	}

	public void buttonProperties()
	{
		button.setBounds(130,200,100,40);
		frame.add(button);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	    //Changing Background Color
	    frame.getContentPane().setBackground(Color.pink);
	
	}
}

public class Calculator {
    public static void main(String[] args)
    {
        new Ui();
    }
}
