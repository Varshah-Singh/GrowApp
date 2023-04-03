 import java.util.Scanner;
class Assig4
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist integer value");
int m=s.nextInt();
System.out.println("enter the second integer value");
int n=s.nextInt();
int sum=0;
for(int i=m;i<=n;i++)
{
sum=sum+i;
}
System.out.println("sum of thne value is " + sum);
}
}