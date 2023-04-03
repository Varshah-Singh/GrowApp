import java.util.Scanner;
class ArithmaticOperationPassingValue
{
public static void add(int a,int b)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
double num1=s.nextDouble();
System.out.println("enter the second number");
double num2=s.nextDouble();
double result=num1+num2;
System.out.println(result);
}

public static void sub(int a,int b)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
double num1=s.nextDouble();
System.out.println("enter the second number");
double num2=s.nextDouble();
double d=num1-num2;
System.out.println(d);
}

public static void mul(int a,int b)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
double num1=s.nextDouble();
System.out.println("enter the second number");
double num2=s.nextDouble();
double d=num1*num2;
System.out.println(d);
} 

public static void div(int a,int b)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
double num1=s.nextDouble();
System.out.println("enter the second number");
double num2=s.nextDouble();
double result=num1/num2;
System.out.println(result);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the operation to be performed");
System.out.println("1.addition/n2.subtraction/n3.multiplication/n4.division");
int choice=sc.nextInt(); 
switch(choice)
{
case 1:add(1,2);
break;
case 2:sub(3,4);
break;
case 3:mul(2,3);
break;
case 4:div(10,2);
break;
default:System.out.println("invalid input");

}
}
}
 
