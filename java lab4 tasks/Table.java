import java.util.Scanner;
class Table 
{
 public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
System.out.print("Enter number:");        
int n=s.nextInt();
System.out.print("Enter starting point:");        
int a=s.nextInt();
System.out.print("Enter ending point:");        
int b=s.nextInt();
 for(int i=a;i<=b;i++)
 {
System.out.println(n+" * "+i+" = "+n*i);
}
}
}
