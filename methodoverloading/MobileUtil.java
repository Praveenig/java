class MobileUtil{

public static void main(String a[]){

Mobile mob =new Mobile();
mob.rate =9000;
mob.brand = "Realme";
mob.model = "Android";
mob.mobileId =565555555l;
mob.purchaseMobile();
System.out.println(mob.rate +"\n"+ mob.brand +"\n"+ mob.model+"\n"+mob.mobileId);

}
}