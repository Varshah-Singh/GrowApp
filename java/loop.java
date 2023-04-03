import java.util.Scanner;
class loop
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
System.out.println("enter the frist value");
int a=s.nextInt();
System.out.println("enter the second value");
int b=s.nextInt();
System.out.println("enter the third value");
int c=s.nextInt();
if(a>b && a>c)
{
System.out.println("the greater number is " + a);
}
else if(b>c){
System.out.println("the greater number is " + b);
}
else
System.out.println("the greater number is " + c);
}
}