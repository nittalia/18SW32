import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter a alphabet:");
char alp= scan.next().charAt(0);
switch (alp)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(alp+" is a vowel");
break;
default:
System.out.println(alp+" is a consonant");
}
}
}