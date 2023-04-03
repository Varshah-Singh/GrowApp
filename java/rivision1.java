import java.util.Scanner;
class rivision1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
int a=s.nextInt();
System.out.println("enter the second number");
int b=s.nextInt();
int sum=0;
for(int i=a;i<=b;i++){
sum=sum-i;
}
System.out.println("sum of the value" + sum);
}
}