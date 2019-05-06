import java.util.Scanner;
class Bill
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter the units you consume:");
int bill=0;
int unit= scan.nextInt();
if(unit>300)
{
unit=unit-300;
bill=bill+unit*30;
unit=300;
}
if(unit<=300 && unit>200)
{
unit=unit-200;
bill=bill+unit*25;
unit=200;
}
if(unit<=200 && unit>100)
{
unit=unit-100;
bill=bill+unit*20;
unit=100;
}
if(unit<=100 && unit>50)
{
unit=unit-50;
bill=bill+unit*15;
unit=50;
}
if(unit<=50 && unit>0)
{
bill=bill+unit*10;
}
System.out.println("Total bill is:"+bill);
	}
}