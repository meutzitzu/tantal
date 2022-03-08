//package tantal;

import javax.swing.*;  
import java.awt.event.*;

public class Ui extends JFrame implements ActionListener
{
	static JFrame fr;
        
	static JButton btn;

	static JTextField inx0;
	static JTextField inv0;
	static JTextField ina;
	static JTextField inT;

	static JLabel lx0;
	static JLabel lv0;
	static JLabel la;
	static JLabel lT;

	static JLabel lR;

//	UVRM calc = new UVRM();

	//default constructor
	Ui()
	{
		//empty for now
	}

	public static void getCalcInstance()
	{
		
	}

	public static void main(String[] args) 
	{  
		JFrame fr=new JFrame();//creating instance of JFrame  
	        
		JButton btn=new JButton("COMPUTE");//creating instance of JButton  

		Ui ui = new Ui();
			
		btn.addActionListener
		( 
			new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					
				}
			}
		);

		JTextField inx0 = new JTextField(8);
		JTextField inv0 = new JTextField(8);
		JTextField ina = new JTextField(8);
		JTextField inT = new JTextField(8);

		JLabel lx0 = new JLabel("x0 = ");
		JLabel lv0 = new JLabel("v0 = ");
		JLabel la  = new JLabel(" a = ");
		JLabel lT  = new JLabel(" t = ");
		JLabel lR  = new JLabel(" R = not computed yet");

		lx0.setBounds(100,100,100, 40);//x axis, y axis, width, height  
		lv0.setBounds(100,200,100, 40);//x axis, y axis, width, height  
		la.setBounds(100,300,100, 40);//x axis, y axis, width, height  
		lT.setBounds(100,400,100, 40);//x axis, y axis, width, height  
		lR.setBounds(100,900,1000, 40);//x axis, y axis, width, height  
	
		inx0.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		inv0.setBounds(130,200,100, 40);//x axis, y axis, width, height  
		ina.setBounds(130,300,100, 40);//x axis, y axis, width, height  
		inT.setBounds(130,400,100, 40);//x axis, y axis, width, height  
		btn.setBounds(130,600,100, 40);//x axis, y axis, width, height  
	        
		fr.add(lx0);//adding button in JFrame  
		fr.add(lv0);//adding button in JFrame  
		fr.add(la);//adding button in JFrame  
		fr.add(lT);//adding button in JFrame  
		fr.add(lR);//adding button in JFrame  
	              
		fr.add(inx0);//adding button in JFrame  
		fr.add(inv0);//adding button in JFrame  
		fr.add(ina);//adding button in JFrame  
		fr.add(inT);//adding button in JFrame  
		fr.add(btn);//adding button in JFrame  
	              
		fr.setSize(400,1200);//400 width and 500 height  
		fr.setLayout(null);//using no layout managers  
		fr.setVisible(true);//making the frame visible  
    	}  

	public void actionPerformed(ActionEvent e)
    	{
        	String s = e.getActionCommand();
        	if (s.equals("COMPUTE")) 
		{
			lR.setText(inx0.getText());
		/*
			lR.setText
				(
					calc.rez
					(
						calc.calcx
						(
							Double.parseDouble(inx0.getText()),
							Double.parseDouble(inv0.getText()),
							Double.parseDouble(ina.getText()),
							Double.parseDouble(inT.getText())
						),
						calc.calcv
						(
							Double.parseDouble(inv0.getText()),
							Double.parseDouble(ina.getText()),
							Double.parseDouble(inT.getText())
						)
					)
				);
        	*/
		}
    	}
}  
