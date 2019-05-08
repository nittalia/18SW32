import java.util.Scanner;
class Position
{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int x[]={1,5,3,8,27,34};
		System.out.println("Enter Number you wanna Search");
		int a=s.nextInt();
		int p=0;
		int c=0;
		int i;
		for(i=0;i<x.length;i++){
			if(a==x[i]){
				c=0;
				p=i+1;
				break;
			}else{
				c++;
			}
		}
		if(c==0)
			System.out.println("Number Found at Position "+p);
		else 
			System.out.println("sorry, position Not found try again!");

	}
}