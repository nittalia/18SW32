public class Student
{
	String name;
	int age;
	String dep;
	String rollno;
	Student()
	{
		name=null;
		age=0;
		dep=null;
		rollno=null;
	}
	Student(String name,int age,String dep,String rollno)
	{
		this.name=name;
		this.age=age;
		this.dep=dep;
		this.rollno=rollno;
	}
	void setData(String name,int age,String dep,String rollno)
	{
		this.name=name;
		this.age=age;
		this.dep=dep;
		this.rollno=rollno;
	}
	void getData()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Dep:"+dep);
		System.out.println("RollNo:"+rollno);
	}
	public static void main(String[]args)
	{
		Student s1=new Student("nittalia zaheer",18,"SoftwareEng","18SW32");
		s1.getData();
	}
}