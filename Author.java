class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public char getGender(){
		return gender;
	}
	public String toString(){
		return ("Author[name="+getName()+", email="+getEmail()+", gender="+getGender()+"]");
	}
}
class Book{
	private String name;
	private Author author[];
	private double price;
	private int qty;
	public Book(String name,Author[] author,double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public Book(String name,Author[] author,double price,int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public String getName(){
		return name;
	}
	public Author[] getAuthors(){
		return author;
	}
	public double getPrice(){
		return price;
	}
	public int getQty(){
		return qty;
	}
	public String toString(){
		String auths="";
		for(int i=0;i<author.length;i++){
			if(i==author.length-1)
				auths+=author[i].toString();
			else
				auths+=author[i].toString()+",";
		}
	return ("Book[name="+getName()+",authors={"+auths+"}, price="+getPrice()+", qty="+getQty()+"]");
	}
	public String getAuthorNames(){
		String auths="";
		for(int i=0;i<author.length;i++){
			if(i==author.length-1)
				auths+="Author"+(i+1)+"="+author[i].getName();
			else
				auths+="Author"+(i+1)+"="+author[i].getName()+",";
		}
		return auths;
	}

}
class Task2{
	public static void main(String args[]){
		Author auth1=new Author("ena","abc@c++.com",'f');
		Author auth2=new Author("Robert","1111@gmail.com",'m');
		Author author[]={auth1,auth2};
		
		Book b1=new Book("C++",author,500,2);
		
		System.out.println(b1.toString());
		System.out.println();
		System.out.println(b1.getAuthorNames());
	}
}