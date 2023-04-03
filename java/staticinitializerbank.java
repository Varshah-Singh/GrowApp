import java.util.Scanner;
class staticinitializerbank
{
    static double deposite;
    static double withdraw;
    static double balance=10000;
public static void deposite()

{
    Scanner s=new Scanner(System.in);
    System.out.println("enter the amount to be deposite");
    deposite=s.nextDouble();
    balance+=deposite;
    System.out.println("the current balence is " + balance);
}

public static void withdraw()

{
    Scanner s=new Scanner(System.in);
    System.out.println("enter the amount to be deposite");
    withdraw=s.nextDouble();
    if(balance>=withdraw)
   {
    balance-=withdraw; 

    }

    else

          System.out.println("your balance is less than the withdraw");
     System.out.println("theamount is " + balance);
}

public static void main(String[] args)
	{
     	Scanner sc=new Scanner(System.in);
     	boolean cond=true;
	while(cond)

		{
     		System.out.println("performed the opretion");
     		System.out.println("1.viewaccount balance\n2.withdraw\n3.deposite\n4.exit");
                int choice= sc.nextInt();
                switch(choice)

		{
		case 1:System.out.println("your balance is " +balance);
                break;
                case 2:withdraw();
                break;
                case 3:deposite();
                break;
                case 4:cond=false;
                break;
                default:System.out.println("enter the option shown above  ");
                  }
               }
           }
          }


    