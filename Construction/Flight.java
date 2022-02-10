class Flight{

int flightId;
String flightName;
String companyName;
int seatingCapacity;
double pricePerSeat;
int noOfAirHostess;

public Flight(int fId,String fName,String cName, int sCapacity,double pPerSeat, int nAirHostess){
	flightId =fId;
	companyName =fName;
	seatingCapacity =sCapacity;
	pricePerSeat =pPerSeat;
	noOfAirHostess =nAirHostess;
	
	System.out.println("Defualt parameter");
}

public void toTraval(){
System.out.println("travlling from Airoplane");
}

}