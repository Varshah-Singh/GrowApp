class Swiggi
{
private int delivery_no;
private int driver_no;
private boolean Covid_check;
private String Time_delivery;
private String Loc;
private String Dliver_name;
 Swiggi(int delivery_no,int driver_no,boolean Covid_check,String Time_delivery,String Loc,String Dliver_name)
{
this.delivery_no=delivery_no;
this.driver_no=driver_no;
this.Covid_check=Covid_check;
this.Time_delivery=Time_delivery;
this.Loc=Loc;
this.Dliver_name=Dliver_name;
}
public int getdelivery_no()
{
return delivery_no;
}
public void setdelivery_no(int delivery_no) 
{
this.delivery_no=delivery_no;
}
public int getdriver_no()
{
return driver_no;
}
public void setdriver_no(int driver_no)
{
this.driver_no=driver_no;
}
public boolean getCovid_check()
{
return Covid_check;
}
public void setCovid_check(boolean Covid_check)
{
this.Covid_check=Covid_check;
}
public  String getTime_delivery()
{
return Time_delivery;
}
public void setTime_delivery(String Time_delivery)  
{
this.Time_delivery=Time_delivery;
}
public String getLoc()
{
return Loc;
}
public void setLoc(String Loc)
{
this.Loc=Loc;
}
public  String getDliver_name()
{
return Dliver_name;
}
public void setDliver_name( String Dliver_name)
{
this.Dliver_name=Dliver_name;
} 
}