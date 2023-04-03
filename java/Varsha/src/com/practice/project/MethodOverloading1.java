package com.practice.project;
//compile time methodOver loading;
public class MethodOverloading1 {
public void m(int a)
{
	System.out.println("m() from frist");
}
public void m(String b)
{
	System.out.println("m() from second");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading1 m=new MethodOverloading1();
		m.m(3);
		m.m("fhghhj");
	}

}
