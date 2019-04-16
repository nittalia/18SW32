class Logical
{
	public static void main(String args[])
	{
	int a=6;
	int b=12;
	int c=18;
	System.out.println("a<b & b>c"+(a<b & b>c));
	System.out.println("a>b | b>c"+(a>b | b>c));
	System.out.println("a>b ^ b<c"+(a>b ^ b<c));
	System.out.println("a<b && b>c"+(a<b && b>c));
	System.out.println("a>b || b>C"+(a>b || b>c));
	System.out.println("!(a<b)"+(!(a<b)));
	}
}