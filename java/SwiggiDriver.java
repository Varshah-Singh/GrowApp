class SwiggiDriver
{
public static void main(String[] args)
{
Swiggi b=new Swiggi(234,34,true,"30 min","Bangalore","Varsha");
System.out.println("program start");
Swiggi x=new Swiggi(234,34,true,"30 min","Bangalore","Varsha");
System.out.println("before Delivery no is " +x.getdelivery_no());
System.out.println("before Driver no is " +x.getdriver_no());
System.out.println("before covid checkup is " +x.getCovid_check());
System.out.println("before Time of delivery is " +x.getTime_delivery());
System.out.println("before loc is " +x.getLoc());
System.out.println("before Dliver name is " +x.getDliver_name());
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
x.setdelivery_no(254);
x.setdriver_no(24);
x.setCovid_check(false);
x.setTime_delivery("1 har");
x.setLoc("Kanpur");
x.setDliver_name("Ansh");
System.out.println("====================================================");
System.out.println("the delivery that is update is " +x.getdelivery_no());
System.out.println("the driver that is update is " +x.getdriver_no());
System.out.println("the Covid_check that is update is " +x.getCovid_check());
System.out.println("the time of delivery that is update is " +x.getTime_delivery());
System.out.println("the Loc that is update is " +x.getLoc());
System.out.println("the name of dliver that is update is " +x.getDliver_name());
System.out.println("!!!!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
}
}




