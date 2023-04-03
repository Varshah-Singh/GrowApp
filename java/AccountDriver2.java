import java.util.Scanner;
class AccountDriver2
{
public static void main(String[] args)
{
System.out.println("========program start==============");
Scanner a=new Scanner(System.in);
System.out.println("enter the A_name");
String A_name=a.next();
System.out.println("enter the Acc_no");
int Acc_no=a.nextInt();
System.out.println("enter the IFSC");
String IFSC=a.next();
System.out.println("enter the Acc_type");
String Acc_type=a.next();
System.out.println("enter the Balance");
double Balance=a.nextDouble();
System.out.println("enter the Nominee");
String Nominee=a.next();
System.out.println("========!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!==============");
Account2 z=new Account2(A_name,Acc_no,IFSC,Acc_type,Balance,Nominee);
System.out.println("the before A_name is " + z.getA_name());
System.out.println("the before Account number is " + z.getAcc_no());
System.out.println("the before IFSC code is " + z.getIFSC());
System.out.println("the before Account type is " + z.getAcc_type());
System.out.println("the before bank balance is " + z.getBalance());
System.out.println("the before Nominee  is " + z.getNominee());
System.out.println("========!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!==============");
System.out.println("enter the name u want to update");
String A_name1=a.next();
z.setA_name(A_name1);
System.out.println("enter the account number that is to be updated");
int Acc_no1=a.nextInt();
z.setAcc_no(Acc_no1);
System.out.println("enter the IFSC code that is to be updated");
String IFSC1=a.next();
z.setIFSC(IFSC1);
System.out.println("enter the Acc_type that is to be updated");
String Acc_type1=a.next();
z.setAcc_type(Acc_type1);
System.out.println("enter the Balance that is to be updated");
double Balance1=a.nextDouble();
z.setBalance(Balance1);
System.out.println("enter the Nominee that is to be updated");
String Nominee1=a.next();
z.setNominee(Nominee);
System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
System.out.println("the updated A_name is " +z.getA_name());
System.out.println("the updated Acc_no is " +z.getAcc_no());
System.out.println("the updated IFSC is " +z.getIFSC());
System.out.println("the updated Acc_type is " +z.getAcc_type());
System.out.println("the updated balance is " +z.getBalance());
System.out.println("the updated nominee is " +z.getNominee());
System.out.println("========%%^^^^^^^^^^^^^^^^^^^^%%==============");
}
}