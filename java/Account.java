class Account
{
private String A_name;
private int Acc_no;
private String IFSC;
private String Acc_type;
private double Balance;
private String Nominee;
 Account(String A_name,int Acc_no,String IFSC,String Acc_type,double Balance,String Nominee)
{
this.A_name=A_name;
this.Acc_no=Acc_no;
this.IFSC=IFSC;
this.Acc_type=Acc_type;
this.Balance=Balance;
this.Nominee=Nominee;
}
public String getA_name()
{
return A_name;
}
public void setA_name(String A_name)
{
this.A_name=A_name;
}
public int getAcc_no()
{
return Acc_no;
}
public void setAcc_no(int Acc_no)
{
this.Acc_no=Acc_no;
}
public String getIFSC()
{
return IFSC;
}
public void setIFSC(String IFSC)
{
this.IFSC=IFSC;
}
public  String getAcc_type()
{
return Acc_type;
}
public void setAcc_type(String Acc_type)
{
this.Acc_type=Acc_type;
}
public double getBalance()
{
return Balance;
}
public void setBalance(double Balance) 
{
this.Balance=Balance;
}
public String getNominee()
{
return Nominee;
}
public void setNominee(String Nominee)
{
this.Nominee=Nominee;
}
}




