class Maxval
{
	public static void main(String args[])
	{ 
	  int x[]=new int[]{4,8,5,6,3,7};
	  int max=x[0];
	  int i;
	  for(i=0;i<x.length;i++)
	   {
	   if(max<x[i])
	    {
	      max=x[i];
	    }
	   }
	   System.out.println(max+" "  "is the maximun value in array");
	}
}