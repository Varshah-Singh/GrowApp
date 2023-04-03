class Bookmyshow
{
private int ticket_no=12;
private int seat_no=1;
private String viewer_name="hitesh";
private String move_name="kgf";
private int price=1200;
private String mode_payment="debit card";

public int getticketno()
{
 return ticket_no;
}
public int getseat_no()
{
return seat_no;
}
public String getviewer_name()
{
return viewer_name;
}
public  String getmovename()
{
return move_name;
}
public int  getprice()
{
return price;
}
public String getmode_payment()
{
return mode_payment;
}
public void BookmyshowDetails()
{
System.out.println("ticket no is "+ ticket_no);
System.out.println("seat no is "+ seat_no);
System.out.println("viewer name is " + viewer_name);
System.out.println("the move name is " + move_name);
System.out.println("the ticket price of " + price);
System.out.println("the payment mode is " + mode_payment);
}
}
