class windowDetailsUtil{

public static void main(String a[])
{

windowDetails wnd= new windowDetails();

wnd.setid(6);
wnd.setrate(666);
wnd.settype("Wooden");
wnd.setmeterial("Standerd");

System.out.println(wnd.getid());
System.out.println(wnd.getrate());
System.out.println(wnd.gettype());
System.out.println(wnd.getmeterial());
}
}