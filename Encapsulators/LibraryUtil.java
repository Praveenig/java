class LibraryUtil{

public static void main(String a[])
{

 LibraryDetails lbd =new LibraryDetails();
 
 lbd.setid(6);
 lbd.setlibraryName("Bendre Library");
 lbd.setlibraryAddress("Dharawad");
 lbd.setcontactNo(666666666l);

System.out.println(lbd.getid());
System.out.println(lbd.getlibraryName());
System.out.println(lbd.getlibraryAddress());
System.out.println(lbd.getcontactNo());
}

}