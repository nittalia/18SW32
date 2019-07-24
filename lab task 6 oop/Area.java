class Area
{
	public void calcuateArea(double l)
	{
		System.out.print("Area of Square = "+l*l);
		System.out.println();
	}
	
	public void calcuateArea(double l, double w)
	{
		System.out.print("Area of Rectangle = "+l*w);
		System.out.println();
	}
	
}

class Task4
{
public static void main(String args[])
{
	
	Area obj =  new Area();
	obj.calcuateArea(4);
	obj.calcuateArea(4,2);
	
}
}