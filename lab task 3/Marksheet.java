import java.util.Scanner;
class Marksheet
{
	public static void main(String args[])
	{
	int obtainedmarks;
	char grade='a';
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the marks you obtained:");
	obtainedmarks= scan.nextInt();
	if(obtainedmarks>90)
	{
	System.out.println("you got grade:");
	grade='A';
	}
	else if(obtainedmarks>70 && obtainedmarks<79)
	{
	System.out.println("you got grade:");
	grade='B';
	}
	else if(obtainedmarks>60 && obtainedmarks<69)
	{
	System.out.println("you got grade:");
	grade='C';
	}
	else if(obtainedmarks<60)
	{
	System.out.println("you got grade:");
	grade='F';
	}
	System.out.println(grade);

	}
}