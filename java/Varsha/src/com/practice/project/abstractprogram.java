package com.practice.project;

 public class abstractprogram extends A{
public void m1()
{
	System.out.println("hello m1()");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractprogram A=new abstractprogram();
		A.m1();
		B b=new B();
		b.m1();
	}

}
