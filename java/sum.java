import java.util.Scanner;
public class sum
{
public static void sum()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the frist number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
int c=a+b;
System.out.println(c);
}
public static void mul()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the frist number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
int c=a*b;
System.out.println(c);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("perform oprations");
System.out.println("no1.addition\no2.multiplication");
int choice=sc.nextInt();
switch(choice)
{

case 1: sum();
break;
case 2: mul();
default: System.out.println("invalid intput");
}
}
}
