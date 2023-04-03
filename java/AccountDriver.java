class AccountDriver
{
public static void main(String[] args)
{
System.out.println("========program start==============");
Account z=new Account("varsha",1234,"BARBORAJPUR","Current",3245.5,"REEMA");
System.out.println("the before A_name is " + z.getA_name());
System.out.println("the before Account number is " + z.getAcc_no());
System.out.println("the before IFSC code is " + z.getIFSC());
System.out.println("the before Account type is " + z.getAcc_type());
System.out.println("the before bank balance is " + z.getBalance());
System.out.println("the before Nominee  is " + z.getNominee());
System.out.println("========!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!==============");
z.setA_name("hitesh");
z.setAcc_no(4345);
z.setIFSC("ICIC0001417");
z.setAcc_type("Saving");
z.setBalance(2345.0);
z.setNominee("Umeda");
System.out.println("the updated A_name is " +z.getA_name());
System.out.println("the updated Acc_no is " +z.getAcc_no());
System.out.println("the updated IFSC is " +z.getIFSC());
System.out.println("the updated Acc_type is " +z.getAcc_type());
System.out.println("the updated balance is " +z.getBalance());
System.out.println("the updated nominee is " +z.getNominee());
System.out.println("========%%^^^^^^^^^^^^^^^^^^^^%%==============");
}
}