class demo
{
public static void add()
{
int a=10;
int b=20;
int c=a+b;
System.out.println(c);
}
public static  void sub(int a,int b)
{
int c=a-b;
System.out.println(c);
}
public static int mul()
{
int a=10;
int b=20;
int c=a*b;
return c;
}
public static int div(int a,int b)
{
int c=a/b;
return c;
}
public static void main(String[] args)
{
add();
sub(10,20);
System.out.println(mul());
System.out.println(div(65,13));
}
} 