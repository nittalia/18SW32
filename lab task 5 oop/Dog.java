class Dog
{
	String breed;
	String name;
	int set=0;
	int age;
	void setDetails(String breed,String name,int age)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		set++;
	}
	void showDetails()
	{
		if(set!=0)
		{
			System.out.println("Name :"+name);
			System.out.println("Breed :"+breed);
			System.out.println("Age :"+age);
		}
		else
		{
			System.out.print("Details not available");
		}
		
	}
	public static void main(String[]args)
	{
		Dog d=new Dog();
		d.setDetails("husky","wolfii",12);
		d.showDetails();
		
	}
}