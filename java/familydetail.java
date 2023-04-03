import java.util.Scanner;
class familydetail
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name of father");
String f_name=s.next();
System.out.println("enter the my father age");
int f_age=s.nextInt();
System.out.println("enter the my father gender");
String f_gender=s.next();
System.out.println("enter the his job");
String f_job=s.next();

System.out.println("*******************************");
System.out.println("the name of the father is " + f_name);
System.out.println("the age of my father is " + f_age);
System.out.println("the gender of my father is " + f_gender);
System.out.println("the job of my father is " + f_job);
System.out.println("=================================");

Scanner v=new Scanner(System.in);
System.out.println("enter the mother name");
String m_name=v.next();
System.out.println("the age of my mother");
int m_age=v.nextInt();
System.out.println("the gender of my mother");
String m_gender=v.next();
System.out.println("the job of my mother");
String m_job=v.next();

System.out.println("*************************************");
System.out.println("the name of the mother is " +  m_name);
System.out.println("the age of my mother is " +  m_age);
System.out.println("the gender of my mother is " +  m_gender);
System.out.println("the job of my mother is " + m_job);
System.out.println("=================================");
}
}
