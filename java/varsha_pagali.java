class loops
{
	public static void main(String[] args)
	{
		Scanner s=new scanner(System.in);
System.out.println("enter the frist value");
int a=s.nextln();
Syste.out.println("enter the second value");
int b=s.nextln();
System.out.println("enter the third value");
int c=s.nextln();
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