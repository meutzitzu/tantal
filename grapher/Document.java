import java.util.ArrayList;

public class Document
{
	public ArrayList<Expr> exprs = new ArrayList<Expr>();
	
	
	Document()
	{
		Expr e1 = (x,y) -> {return x*x + y*y -10.0*10.0;};
		exprs.add(e1);
	}
}
