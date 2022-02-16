class PatientUtil{

public static void main(String a[]){

PatientDetails ptd= new PatientDetails();
ptd.setPatientId(5);
ptd.setPatientName("Mahesh");
ptd.setaddress("Banglore");
ptd.setgender("Male");
ptd.setage(66);
ptd.setbloodGroup("AB+");
ptd.setdob("5\5\5");
ptd.setcontactNo(6565556565l);

System.out.println(ptd.getPatientId()); 
System.out.println(ptd.getPatientName());
System.out.println(ptd.getaddress());
System.out.println(ptd.getgender());
System.out.println(ptd.getage());
System.out.println(ptd.getbloodGroup());
System.out.println(ptd.getdob());
System.out.println(ptd.getcontactNo());
}
}