 import java.util.Scanner;
class mul_table
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number which you want multiplication table");
int m=s.nextInt();
for(int i=1;i<=10;i++)
int res=i*m;
System.out.println("i+"*"+m+"="+res);
}
} 