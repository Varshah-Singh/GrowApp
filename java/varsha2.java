import java.util.Scanner;
class varsha2
{
 public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the frist value");
int m=s.nextInt();
System.out.println("enter the second value");
int n=s.nextInt();

for( int i=m;i<=n;i++){
int sum=0;
sum=sum+i;
System.out.println("sum value is " + sum);
}

}
}