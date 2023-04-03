import java.util.Scanner;
class assi
{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
int sum=0;
for(int i=a;i<=b;i++){
sum=sum+i;
System.out.printnl("sum of the values is " + sum);
} 

}
}