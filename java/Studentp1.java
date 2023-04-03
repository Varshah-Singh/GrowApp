class Studentp1
{
String name;
int id;
double fees;
Studentp1(String name,int id,double fees)
{
this.name=name;
this.id=id;
this.fees=fees;
}
public void details()
{
System.out.println("the name of the Student is + name");
System.out.println("the student id is " + id);
System.out.println("the fees of the student is " + fees);
}
public static void main(String[] args)
{
Studentp1 s= new Studentp1("ansh",23,4.6);
Studentp1 s1= new Studentp1("yashi",34,3.4);
Studentp1 s2= new Studentp1("anshi",67,5.7);
System.out.println("========================");
s.details();
System.out.println("========================");
s1.details();
System.out.println("========================");
s2.details();
System.out.println("========================");

}
}