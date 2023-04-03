class Studentp 
{

String name;
int id;
double fees;
Studentp(String name,int id,double fees)
{
this.name=name;
this.id=id;
this.fees=fees;
}
public void details()
{
System.out.println("the name of Student is " + name);
System.out.println("the id of the Student is " + id);
System.out.println("the fees of the Student is " + fees);
}
public static void main(String[] args)
{
Studentp s=new Studentp("varsha",23,42.3);
Studentp s1=new Studentp("hitesh",12,2.3);
Studentp s2=new Studentp("jay",34,2.5);

System.out.println("======================================");
s.details();
System.out.println("======================================");
s1.details();
System.out.println("======================================");
s2.details();
System.out.println("======================================");


}
}