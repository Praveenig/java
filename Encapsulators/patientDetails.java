class PatientDetails{

private int patientId;
private String patientName;
private String address;
private String gender;
private int age;
private String bloodGroup;
private String dob;
private long contactNo;

public void setPatientId(int patientId)
{
	this.patientId=patientId;
}
public int getPatientId()
{
	return patientId;	
}
public void setPatientName(String patientName)
{
	this.patientName=patientName;
}
public String getPatientName()
{
	return patientName;
}
public void setaddress(String address)
{
this.address =address;
}
public String getaddress()
{
	return address;
}
public void setgender(String gender)
{
this.gender =gender;
}
public String getgender()
{
	return gender;
}
public void setage(int age)
{
this.age =age;
}
public int getage()
{
	return age;
}
public void setbloodGroup(String bloodGroup)
{
this.bloodGroup = bloodGroup;	
}
public String getbloodGroup()
{
	return bloodGroup;
}
public void setdob(String dob)
{
	this.dob = dob;
}
public String getdob()
{
	return dob;
}
public void setcontactNo(long contactNo)
{
this.contactNo =contactNo;
}
public long getcontactNo()
{
	return contactNo;
}
}