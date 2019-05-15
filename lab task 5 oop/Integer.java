import java.util.Scanner;
class Integer
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("what should be size of array");
		int size=s.nextInt();
		Test t1=new Test(size);
		t1.populateArray();
		t1.showDetails();
	}
}
class Test
{
	int arr[];
	int size;
	Test(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	void populateArray()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Elements of an Array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
	}
	void showDetails()
	{
		System.out.print("Even:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
		System.out.print("Odd:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}
	}
}