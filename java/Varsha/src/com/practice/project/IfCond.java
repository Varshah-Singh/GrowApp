package com.practice.project;

import java.util.Scanner;

public class IfCond {
	public void m() {
Scanner sc=new Scanner(System.in);
System.out.println("enter the frist value");
int num=sc.nextInt();
System.out.println("enter the frist value");
int num2=sc.nextInt();
if(num<num2)
{
	System.out.println(num);
}
else if(num>num2)
{
	System.out.println(num2);
}
else
{
	System.out.println("default");
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
IfCond c=new IfCond();
c.m();
	}

}
