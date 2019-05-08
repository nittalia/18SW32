class Array
{
  public static void main(String args[])
  {
  	 int x[][]= {{ 1,2,6},{6,8,4}};
	 int y[][]= {{ 9,6,3},{5,4,4}};
	 int z[][]= new int[2][3];
	  int i,j;
	    for(i=0;i<2;i++)
	      {
	       for(j=0;j<3;j++)
	         {
               z[i][j]=x[i][j]+y[i][j];
               System.out.print(z[i][j]+ " ");
             }
               System.out.println();
	      }
	}
}