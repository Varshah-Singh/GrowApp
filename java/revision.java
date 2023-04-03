import java.util.Scanner;
public class revision
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the frist number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
int i=0;
for(i=a;i>=b;i++);
{
int c=i/2;
System.out.println("all the number" + c);

}
}
}