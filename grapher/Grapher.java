import java.util.Scanner;
import java.io.IOException;

public class Grapher 
{
	
	static int width;
	static int height;
	
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		width=(args.length >=2 ? Integer.parseInt(args[0]) : 80);
		height=(args.length >=2 ? Integer.parseInt(args[1])-2 : 40);
//		System.out.printf("found arguments:\n%s\n%s\n", args[0], args[1]);
		TermWindow window = new TermWindow(width, height);
		Graph graph = new Graph(window);
		
		//graph.render();
		loop(graph);
	}
	
	
	static void loop(Graph graph)
	{
		Scanner cin;
		cin = new Scanner(System.in);
		String[] cmd1 = {"/bin/sh", "-c", "stty raw </dev/tty"};
		String[] cmd2 = {"/bin/sh", "-c", "stty sane </dev/tty"};
		
		graph.render();
		try{
		Runtime.getRuntime().exec(cmd1).waitFor();
		}
		catch(Exception e)
		{
		}
		
		while(true)
		{
			try
			{
				//Runtime.getRuntime().exec(cmd1).waitFor();
				
				char c = (char)System.in.read();
				graph.ctrl(c);
				
				//Runtime.getRuntime().exec(cmd2).waitFor();
				
				if (c == 'q')
				{
					Runtime.getRuntime().exec(cmd2).waitFor();
					break;
				}
			}
			catch(Exception e)
			{
			}
			
			graph.render();
		}
	}

}
