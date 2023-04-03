class School
{
String sch_name;
double stu_no;
int no_class;
int tea_no;
double stu_fees;
School()
{}
School(String sch_name)
{
this.sch_name=sch_name;
}
School(String sch_name,double stu_no)
{
this(sch_name);
this.stu_no=stu_no;
}
School(String sch_name,double stu_no,int no_class)
{
this(sch_name,stu_no);
this.no_class=no_class;
}
School(String s_name,double stu_no,int no_class, int tea_no)
{
this(s_name,stu_no,no_class);
this.tea_no=tea_no;
}
School(String s_name,double stu_no, int no_class, int tea_no,double fees)
{
this(s_name,stu_no,no_class,tea_no);
this.stu_fees=stu_fees;
}
public void SchoolDetailes()
{
System.out.println(sch_name);
System.out.println(stu_no);
System.out.println(no_class);
System.out.println(tea_no);
System.out.println(stu_fees);
}
public static void main(String[] args)
{
School a=new School();
School a1=new School("bachapan play school",200);
School a2=new School("heritage public school",5000,50);
School a3=new School("delhi public school",2000,20,25);
School a4=new School("malviy inter collage",3000,25,30,1500.o);
a.SchoolDetailes();
a2.SchoolDetailes();
a3.SchoolDetailes();
a4.SchoolDetailes();
}
}


