class Flight{

int flightId;
String flightName;
String companyName;
int seatingCapacity;
double pricePerSeat;
int noOfAirHostess;

public Flight(){ 

	System.out.println("Flight Constructor with zero parameter");
}

public Flight(int flightId,String flightName,String companyName, int seatingCapacity,double pricePerSeat, int noOAirHostess){
	this();//calling one constructor to another constructor using this();
	
	System.out.println(flightId +"\n"+flightName+"\n"+companyName+"\n"+seatingCapacity+"\n"+pricePerSeat+"\n"+noOfAirHostess);
	
	this.flightId =flightId;
	this.flightName =flightName;
	this.companyName =companyName;
	this.seatingCapacity =seatingCapacity;
	this.pricePerSeat= pricePerSeat;
	this.noOfAirHostess=noOAirHostess;
	
	System.out.println("Defualt parameter");
}

//public void toTraval(){
//System.out.println("travlling from Airoplane");
//}
}