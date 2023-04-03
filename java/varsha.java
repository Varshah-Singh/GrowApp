import java.util.Scanner;
public class varsha
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist number");
int m=s.nextInt();
System .out.println("enter the second number");
int n=s.nextInt();
  int i=1;
for(i=m;i<=n;i++)
{
int c=i%2;
if(c==1){
System.out.println("print the odd number" + i);
}
}

}
}