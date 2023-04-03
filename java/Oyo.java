     class Oyo
  {
private String Hotel_name="Oyo exotica";
private int Room_no=124;
private String loc="bangalore";
private int Price=1200;
private int No_avai=10;
private String Check_in="12.00 AM";
private  String Check_out="11.00 AM";
public String getHotel_name()
{
return Hotel_name;
}
public int getRoom_no()
{
return  Room_no;
}
public String getloc()
{
return loc;
}
public int getPrice()
{
return Price;
}
public String getCheck_in()
{
return Check_in;
}
public String getCheck_out()
{
return Check_out;
}
public void OyoDetails()
{
System.out.println("the name of hotel is " + Hotel_name);
System.out.println("the no of room is " + Room_no);
System.out.println("the location of hotel is " + loc);
System.out.println("the rent of room is " + Price);
System.out.println("no of availbility is " + No_avai);
System.out.println("time od check in is " +Check_in);
System.out.println("time of check out is " + Check_out);
} 
}  
  
