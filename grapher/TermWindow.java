

public class TermWindow 
{

	int width;
	int height;
	
	char[][] canvas;

	TermWindow( int w, int h)
	{
		width = w;
		height = h;
		canvas = new char[width][height];
		wipe();
	}
	
	public void setChar(int x, int y, char c)
	{
		canvas[x][y]=c;
	}

	public void wipe()
	{
		for (int cy=0; cy<height; cy++)
		{
			for(int cx=0; cx<width; cx++)
			{
				canvas[cx][cy]=' ';
			}
		}
	}
	
	public void render()
	{
		System.out.printf("\033[H\033[2J");
		for (int cy=0; cy<height; cy++)
		{
			for(int cx=0; cx<width; cx++)
			{
				System.out.printf("%c", canvas[cx][cy]);
			}
			System.out.printf("\n\r");
		}
	}
}
