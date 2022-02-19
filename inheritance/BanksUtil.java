class BanksUtil{

public static void main(String a[]){

Banks sbi =new SBI();

sbi.bankId=01;
sbi.branchName ="Rajaji Nagar";
sbi.interest =6.0;
sbi.AcNo =1234567898f;
sbi.AcType ="Savings";

System.out.println(sbi.bankId+"\n"+sbi.branchName+"\n"+sbi.interest+"\n"+sbi.AcNo+"\n"+sbi.AcType);

Banks icici =new ICICI();

icici.bankId=02;
icici.branchName ="JP Nagar";
icici.interest =5.0;
icici.AcNo =1664567898f;
icici.AcType ="Savings";

System.out.println(icici.bankId+"\n"+icici.branchName+"\n"+icici.interest+"\n"+icici.AcNo+"\n"+icici.AcType);

Banks canara =new Canara();

canara.bankId=03;
canara.branchName ="Kuvempu Nagar";
canara.interest =6.6;
canara.AcNo =16645678f;
canara.AcType ="Curent";

System.out.println(canara.bankId+"\n"+canara.branchName+"\n"+canara.interest+"\n"+canara.AcNo+"\n"+canara.AcType);

Banks hdfc =new HDFC();

hdfc.bankId=55;
hdfc.branchName ="Gandi Nagar";
hdfc.interest =5.5;
hdfc.AcNo =1656567898f;
hdfc.AcType ="Curent";

System.out.println(hdfc.bankId+"\n"+hdfc.branchName+"\n"+hdfc.interest+"\n"+hdfc.AcNo+"\n"+hdfc.AcType);
}
}