import java.util.Scanner;
class Scnr
{
    public static void main(String[]args)
    {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter Integer type:");
        int a=i.nextInt();
        System.out.print("Enter String type:");
        String b=i.next();
        System.out.print("Enter float type:");
        float c=i.nextFloat();
        System.out.println("Integer:"+a);
        System.out.println("String:"+b);
        System.out.println("Float:"+c);
    }
}