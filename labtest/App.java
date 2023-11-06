import javax.swing.*;
import javax.swing.table.*;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*;


class Ui implements ActionListener
{
	int width;
	int height;
	double div;
	int windowPadding;
	int fieldHeight;
	int fieldMargin;

	JFrame window;
	JPanel left;
	JPanel mid;

	JTextField start;
	JTextField stop;
	JTextField step;

	JLabel labelstart;
	JLabel labelstop;
	JLabel labelstep;

	Logo logo;

	JTable table;
	DefaultTableModel tdata;

	Ui( int width, int height)
	{
		this.width = width;
		this.height = height;
		windowPadding = 6;
		fieldHeight = 16;
		fieldMargin = 8;
		div = 0.2;
		openWindow();
	//	initMainGui();
	//	initFields();
	//	initGraphics();
	//	initTable();
	}

	public void openWindow()
	{
		window = new JFrame();
		window.setBounds(720,480, width, height);
		window.setBackground(Color.black);
		window.setVisible(true);
	}

	public void initMainGui()
	{
		left = new JPanel();
		left.setBounds(0,0,(int)(width*div), height-(int)(div*width));
		left.setBackground(Color.pink);

		mid = new JPanel();
		mid.setBounds((int)(width*div),0,(int)(width*(1-div)),height);
		mid.setBackground(Color.red);
	/*
		container = new JPanel();
		container.setBounds(0, height-(int)(div*width), (int)(width*div), (int)(width*div));
		container.setBackground(Color.green);
	*/
		initGraphics();
		window.add(left);
//		window.add(container);
		window.add(mid);
	}


	public void initFields()
	{	
		int currentline;
		JLabel labelstart = new JLabel("start");
		JLabel labelstop = new JLabel("stop");
		JLabel labelstep = new JLabel("step");

		start = new JTextField(16);
		stop = new JTextField(16);
		step = new JTextField(16);
		
		
		left.add(labelstart);
		left.add(start);
		left.add(labelstop);
		left.add(stop);
		left.add(labelstep);
		left.add(step);
	}
	
	public void initGraphics()
	{
		logo = new Logo((int)(width*div), 25);
		logo.setBounds(0, height-(int)(div*width), (int)(width*div), (int)(width*div));
		logo.setBackground(Color.blue);
	//	logo.setSize (10, 10);
	}

	public void initTable()
	{

        	String[] columnNames = { " x ", " y "};

        	String[][] data = 
		{
        		{"1.0", "2.5"},
        		{"1.5", "3.5"}
        	};

		table = new JTable(data, columnNames);
		table.setBounds(30, 40, 200, 300);
		//table.setBounds(0,0, 600, 480);
	//	tdata = (DefaultTableModel)table.getModel();


	//	mid.add(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	    //Changing Background Color
	    //frame.getContentPane().setBackground(Color.pink);
	}
}
public class App 
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

		new Ui(720, 480);

	}

}
