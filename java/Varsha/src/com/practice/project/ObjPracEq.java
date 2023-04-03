package com.practice.project;

public class ObjPracEq {

	int num;
	ObjPracEq obj;
	public ObjPracEq(int num) {
		this.num=num;
	}
	
	public ObjPracEq(ObjPracEq obj) {
		this.obj=obj;
	}
	
	
	public static void main(String[] args) {
		
		ObjPracEq a=new ObjPracEq(4);
		ObjPracEq b=a;
		
		ObjPracEq c=new ObjPracEq(b);
		    System.out.println(a);
			System.out.println(b);
			System.out.println(c);         
			
    Integer x=200;
    Integer y=200;
    
    System.out.println(x);
    System.out.println(y);
    System.out.println(x==y);
	}

}
