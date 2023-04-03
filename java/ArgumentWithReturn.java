class ArgumentWithReturn
{
public static int add(int a,int b)
{
int c = a+b;
return c;
}
public static int sub(int a,int b)
{
int c = a-b;
return c;
}
public static int mul(int a,int b)
{
int c = a*b;
return c;
}
public static int div(int a,int b)
{
int c = a/b;
return c;
}
public static void main(String[] args)
{
System.out.println(add(2,40));
System.out.println(sub(2,40));
System.out.println(mul(2,40));
System.out.println(div(2,40));
}
}