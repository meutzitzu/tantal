import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  


class Ui implements ActionListener 
{
	JFrame frame=new JFrame();
	JButton button=new JButton("recompute");
	JTextField field = new JTextField(16);
	JTable table;
	JLabel label = new JLabel("not computed yet");		
	UVRM calc = new FunctionSampler();
//	FunctionSampler calc = new FunctionSampler();

	Ui()
	{
		prepareGUI();
		buttonProperties();
	}


	public void prepareGUI()
	{

		frame.setTitle("shitty interval calculator");
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setBounds(200,200,400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		field.setBounds(10, 10, 80, 40);
		frame.add(field);
		label.setBounds(100, 10, 180, 40);
		frame.add(label);
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
	    //frame.getContentPane().setBackground(Color.pink);
		
	}
}

public class Calculator
{
    public static void main(String[] args)
    {

		try 
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
        new Ui();
    }
}
