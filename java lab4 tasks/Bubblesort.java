class Bubblesort
{
	public static void main(String args[])
	{
		int x[]={5,2,3,8,9,43,77};
		System.out.println("Before Sorting");
		int i,j;
		for(i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x.length-1-i;j++)
			{
				if(x[j]>x[j+1]){
					int tem=x[j];
					x[j]=x[j+1];
					x[j+1]=tem;
				}
			}
		}
		System.out.println('\n'+"After Bubble sort:");
		for(i=0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
	}
}