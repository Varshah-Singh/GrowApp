package Selenium;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="varsha--hitesh";
   
    System.out.println("===============approach 1============= "); 
    for(int i=s.length()-1;i>=0;i--)
    {
    	System.out.println(s.charAt(i) +"");
    	
    }
    System.out.println(" ==============approach 2============");
    char[] st=s.toCharArray();
    for(int i=s.length()-1;i>=0;i--)
    {
    	System.out.println(st[i]+"");
    }
    System.out.println("================approach 3==============");
    String rev="";
    for(int i=s.length()-1;i>=0;i--)
    {
    	rev=rev+s.charAt(i);
    }
	System.out.println(rev +"");
	
	 System.out.println("================approach 4==============");
	 char[] a=s.toCharArray();
	 int count=0;
	 for(char c:a)
	 {
		 count++;
	 }
	for(int i=count-1;i>=0;i--)
	{
		 System.out.println(a[i] +"");
	}
	 System.out.println("================approach 5 by using stringbuilder==============");
	 
	 StringBuilder sb=new StringBuilder(s);
	 System.out.println(sb.reverse());
	}
	}
