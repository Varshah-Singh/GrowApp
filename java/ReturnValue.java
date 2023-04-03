class ReturnValue
{
public static int add()
{
int a = 10;
int b = 20;
int c = a+b;
return c;
}
public static int sub()
{
int a = 10;
int b = 20;
int c = a-b;
return c;
}
public static int mul()
{
int a = 10;
int b = 20;
int c = a*b;
return c;
}
public static int div()
{
int a = 10;
int b = 20;
int c = a/b;
return c;
}
public static void main(String[] args)
{
System.out.println(add());
System.out.println(sub());
System.out.println(mul());
System.out.println(div());
}
}
