import java.util.Scanner;
class my
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println(" enter my name is");
String name=s.next();
System.out.println("enter my location");
String location="";
s.nextLine();
 location+=s.nextLine();
System.out.println("enter  my graduation");
double graduation=s.nextDouble();
System.out.println("enter  my husband name");
String h_name=s.next();

System.out.println("************************");
System.out.println("my name is " + name);
System.out.println("i belongs to " + location);
System.out.println("i have completed my graduation " + graduation);
System.out.println("my husband name is " + h_name);
System.out.println("===============================");
}
} 
