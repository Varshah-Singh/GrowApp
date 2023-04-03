 import java.util.Scanner;
class Reverse
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
int rev_num=0;
while(num!=0)
{
int i=num%10;
rev_num=rev_num*10+i;
num=num/10;
}
System.out.println("sum of thne value is " + rev_num );
}
} 