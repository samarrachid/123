package part8.classes;

public class Flight {
	int passengers;
	int seates;
	
	 Flight() {
		 seates = 10;
		 passengers = 6;
	 }
	 
	 void add1Passenger() {
		 if(passengers < seates ) {
			 passengers += 1;
		 } else {
			 handleTooMany();
		 }
	 }
	 
	 void handleTooMany( ){
		 System.out.println("No more seates!");
	 }
	 
	 public boolean hasRoom(Flight f2) {
		 int total = passengers + f2.passengers;
//		 if(total <= seates) {
//			 return true;
//		 } else {
//			 return false;
//		 }
		 return total <= seates;
		
	}
	 
	 public Flight createNewWithBoth(Flight f2) {
		 Flight newFlight = new Flight();
		 newFlight.seates = seates;
		 newFlight.passengers = passengers + f2.passengers;
		 return newFlight;
	}
	 
	public static void main(String[] args) {
//		Flight flight1 = new Flight();
//		flight1.add1Passenger();
//		 System.out.println(flight1.passengers);
//		 
		 Flight lax1 = new Flight();
		 Flight lax2 = new Flight();
		 //add passenger
		 
		 Flight lax3;
		 if(lax1.hasRoom(lax2)) {
			 lax3=  lax1.createNewWithBoth(lax2);
			 System.out.println(lax3.passengers);

		 }

	}

}
