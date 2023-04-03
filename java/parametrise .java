class parametrise 
{

Student name=name;
Student id=id;
Student fees=fees;
Student(String name,int id,double fees)
{
this.name=name;
this.id=id;
this.fees=fees;
}
public void detail()
{
System.out.println("the name of student is " + name);
System.out.println("the id of the student is " + id);
System.out.println("the fees of the student is " + fees);
}
public ststic void main(String[] args)
{
Student s=new Student("varsha",23,42.3);
Student s1=new Student("hitesh",12,2.3);
Student s3=new Student("jay",34,2.5);
System.out.println("======================================");
s.details();
System.out.println("======================================");
s1.details();
System.out.println("======================================");
s3.details();
System.out.println("======================================");

}
}
}