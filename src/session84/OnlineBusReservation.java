/**
 * OnlineBusReservation.java  1.1   04-Sept-2017
 * 
 */
//package declaration

package session84;

//Class declaration

public class OnlineBusReservation {
	
	public static final int TotalSeats = 20 ;
	
//member variable declaration	
	
	private String PassengerFirstName;
	
	private String PassengerLastName;
	
	private int SeatNumber ;
	
//static variable declaration	
	
	private static int SeatsLeft  = 20 ;
	

//parameterized constructor declaration
	
	public OnlineBusReservation(String PassengerFirstName, String PassengerLastName, int SeatNumber){
		
		this.PassengerFirstName = PassengerFirstName ;
		
		this.PassengerLastName = PassengerLastName ;
		
		this.SeatNumber = SeatNumber ;
		
	}
	
//get method to retrieve Passenger First Name 
	
	public String getPassengerFirstName() {
		
		return PassengerFirstName;
		
	}

//set method to set the passenger first name	
	
	public void setPassengerFirstName(String passengerFirstName) {
		PassengerFirstName = passengerFirstName;
	}

//get method to retrieve Passenger Last Name 
	
	public String getPassengerLastName() {
		
		return PassengerLastName;
		
	}
//set method to set the passenger last name 
	
	public void setPassengerLastName(String passengerLastName) {
		
		PassengerLastName = passengerLastName;
		
	}

//get method to retrieve the seat number of Passenger 
	
	public int getSeatNumber() {
		
		return SeatNumber;
	}
	
//set method to set the Seat Number of each passenger
	
	public void setSeatNumber(int seatNumber) {
		
		SeatNumber = seatNumber;
	}
	
//get method to retrieve the seats left post the booking
	
	public int getSeatsLeft() {
		
		return SeatsLeft;
		
	}

//set method to set the value of Seats left 
	
	public void setSeatsLeft(int seatsLeft) {
		
		SeatsLeft = seatsLeft;
		
	}

//synchronized method declaration to depict the code logic for booking seat for a passenger
	
	synchronized static void reserveSeats(int numberOfSeats){
		

//if leftover seats are more than the total number of seats that thread intends to book
		
		     if(SeatsLeft >= numberOfSeats ){
			
		         SeatsLeft = SeatsLeft - numberOfSeats;
		
                 System.out.println("--------------BOOKING CONFIRMED---------------");
                 			
   			     System.out.println("Total Number of Seats left in bus : "+ SeatsLeft);
   			     
   			     System.out.println("Number of Seats booked in bus by current Thread : "+ numberOfSeats );
   			     
   			     System.out.println("Total Number of Seats booked : " + (TotalSeats - SeatsLeft));
		
		     }
		
//if leftover seats are lesser than the number of total seats that thread intends to book
//then display appropriate message		     
		     
		     else{
			
			    System.out.println("------Insufficient Seats, Booking unsuccessful---------");
			    
		     }
			

		}
		
}
