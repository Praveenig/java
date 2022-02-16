class Furniture{

int furnitureId;
String furnitureCompany;
String color;
int price;
String meterial;

public Furniture(int fId,String fCompany, String clr,int p,String met){
	furnitureId=fId;
	furnitureCompany=fCompany;
	color=clr;
	price=p;
	meterial=met;
	System.out.println("Parameter construction");
	
}

}