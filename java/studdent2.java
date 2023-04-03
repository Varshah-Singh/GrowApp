class Studdent2
{
String name=s_name;
int id=s_id;
double s_dob=s_dob;
String gender=gender;
}
Studdent2(String s_name,int s_id)
{
this.s_name=s_name;
this.s_id=s_id;
}
Studdent2(double s_dob,String gender);
{
this.s_dob=s_dob;
this.gender=gender;
}
Studdent2()
{
}
public void Studdent2Details()
{
System.out.println("the student name is " + s_name);
System.out.println("the student id is " + s_id);
System.out.println("the student date of birth is " + s_dob);
System.out.println("the student gender is " + gender);
}
public static void main(String[] args)
{
System.out.println("strat the program");
Studdent2 a= new Studdent2();
Studdent2 a1= new Studdent2("varsha",12);
Studdent2 a2= new Studdent2("ansh",32,05-07-99);
Studdent2 a3= new Studdent2("hitesh",321,02-03-92,"male");
a.Studdent2Details();
a1.Studdent2Details();
a2.Studdent2Details();
a3.Studdent2Details();

}

}


