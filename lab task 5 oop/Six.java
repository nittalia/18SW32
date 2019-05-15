public class Six
{
    student s;
    Marksheet m;
    Six(student s,Marksheet m)
    {
        this.s=s;
        this.m=m;

    }
    void createStudentResult()
    {
        s.setData("Nittalia zaheer abro", 18, "SoftwareEng", "18SW32");
        s.getData();
        m.setDetails(88.5,93.3,68.7);
        m.getPerc();
        m.getTotal();
    }
    public static void main(String[]args)
    {
        student s=new student();
        Marksheet m=new Marksheet();
        Six six=new Six(s,m);
        six.createStudentResult();
        
    }
}