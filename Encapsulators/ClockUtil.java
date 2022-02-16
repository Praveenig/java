class ClockUtil{

public static void main(String a[])
{

Clock clock = new Clock();

clock.setid(6);
clock.setrate(666);
clock.settype("Glass");
clock.setmeterial("Plastic");

System.out.println(clock.getid());
System.out.println(clock.getrate());
System.out.println(clock.gettype());
System.out.println(clock.getmeterial());
}
}