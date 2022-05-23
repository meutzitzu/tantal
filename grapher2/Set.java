public class Set
{
	public ArrayList<Interval> elements;

	Set()
	{
		elements = new ArrayList()<>;
	}

	public boolean isEmpty()
	{
		return elements.length > 0 ;
	}

	public void addElement(Element)
	{
		elements.append(Element);
	}

	public void refine()
	{
		elements.sort();
	//	reduce duplicate values and merge intervals where possible
	}
}
