class stativvariable
{
static int a=50;
public static void m1()
{
int a=80;
System.out.println(a);
a=95;
System.out.println(a);
}
public static void main(String[] args)
{
System.out.println(a);
stativvariable.a=120;
a=85;
System.out.println(a);
m1();
}
}