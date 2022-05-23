import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  

class Ui implements ActionListener
{
	Viewport window;

	Ui()
	{
		initGui();
	}


	public void initGui()
	{
		window = new Viewport();
		window.setBounds(200,200,400,400);
		window.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	    //Changing Background Color
	    //frame.getContentPane().setBackground(Color.pink);
		
	}
}

public class Grapher
{
	public static void main(String[] args)
	{
		System.out.printf("\nplm, mere !\n");

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
