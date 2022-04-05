import javax.swing.*;  

public class SwingPlafTest 
{


	public static void main(String[] args)
	{
		try 
		{
		        // Set System L&F
		    UIManager.setLookAndFeel(
		        UIManager.getSystemLookAndFeelClassName());
		} 
		catch (UnsupportedLookAndFeelException e) 
		{
		   // handle exception
		}
		catch (ClassNotFoundException e) 
		{
		   // handle exception
		}
		catch (InstantiationException e) 
		{
		   // handle exception
		}
		catch (IllegalAccessException e) 
		{
		   // handle exception
		}

		//new SwingApplication();

		JFrame f=new JFrame();		//creating instance of JFrame


		          
		JButton b=new JButton("click");	//creating instance of JButton  
		b.setBounds(130,100,100, 40);	//x axis, y axis, width, height  
		          
		f.add(b);			//adding button in JFrame  
		          
		f.setSize(400,500);		//400 width and 500 height  
		f.setLayout(null);		//using no layout managers  
		f.setVisible(true);		//making the frame visible  
	}  
}  
