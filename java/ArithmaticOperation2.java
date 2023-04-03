import java.util.Scanner;
class ArithmaticOperation2
{
public static void add()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
double num1=s.nextDouble();
System.out.println("enter the second number");
double num2=s.nextDouble();
double result=num1+num2;
System.out.println(result);
}

public static void sub()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
double num1=s.nextDouble();
System.out.println("enter the second number");
double num2=s.nextDouble();
double result=num1-num2;
System.out.println(result);
}

public static void mul()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
double num1=s.nextDouble();
System.out.println("enter the second number");
double num2=s.nextDouble();
double result=num1*num2;
System.out.println(result);
} 

public static void div()
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
case 1:add();
break;
case 2:sub();
break;
case 3:mul();
break;
case 4:div();
break;
default:System.out.println("invalid input");

}
}
}
 
