class Author
{
	private	String name;
	private String email;
	private char gender;
	
	Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.email;
	}
	public char getGender()
	{	
	return this.gender;
	}
	public String toString()
	{
		return "Author[name = "+this.name+", email = "+this.email+", gender = "+this.gender;
	}

	
}


class Task1
{
public static void main(String args[]){

Author nittalia = new Author("nittalia","nittaliaabro@gmail.com",'f');

System.out.println(nittalia.getName());
System.out.println(nittalia.getEmail());
System.out.println(nittalia.getGender());

nittalia.setEmail("nittaliaabro@gmail.com");

System.out.println(nittalia.toString());


}
}