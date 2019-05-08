import java.util.Scanner;
class Add
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("numbers you wanna add");
		int size=s.nextInt();
		int sum=0;
		int x[]=new int[size];
		System.out.println("Enter "+size+" Numbers");
		for(int i=0;i<x.length;i++)
		{
			x[i]=s.nextInt();
		}
		for(int i=0;i<x.length;i++){
			sum=sum+x[i];
		}
		System.out.println("The Sum of Numbers is "+sum);

	}
}