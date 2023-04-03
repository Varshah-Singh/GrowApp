import java.util.Scanner;
class leap_year
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
if((num%4==0&&num%100!=0) ||num%400==0)
{
System.out.println("yes this is leap year");
}
else
System.out.println("its not a leap year");
}
}