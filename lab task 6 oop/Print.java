class Print
{
	public void printIntChar(int n, char c){
		System.out.print("Int = "+n+" Char = "+c);
		System.out.println();
	}
	
	public void printIntChar(char c, int n){
		System.out.print("Int = "+n+" Char = "+c);
		System.out.println();
	}
	
}

class Task3{
public static void main(String args[]){
	
	Print obj =  new Print();
	obj.printIntChar(1,'A');
	obj.printIntChar('B',2);
	
}
}