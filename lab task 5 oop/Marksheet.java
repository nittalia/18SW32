class Marksheet
{
	double ac;
	double fe;
	double cp;
	void setDetails(double ac,double fe,double cp)
	{
		this.ac=ac;
		this.fe=fe;
		this.cp=cp;
	}
	void getTotal()
	{
		double total=ac+fe+cp;
		System.out.println("Total marks =:"+total);
	}
	void getPerc()
	{
		float per;
		per=(float)((ac+fe+cp)*100/300);
		System.out.println("Percentage is:"+per);
	}
	public static void main(String[]args)
	{
	Marksheet s1=new Marksheet();
	s1.setDetails(88.5,93.3,68.7);
	s1.getTotal();
	s1.getPerc();	
	}
}