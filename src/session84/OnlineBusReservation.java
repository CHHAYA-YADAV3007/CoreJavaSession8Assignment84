package session84;

public class OnlineBusReservation {
	
	public final static int TotalSeats = 20;
	
	public static int SeatsLeft  = 20 ;
	
	private String PassengerFirstName;
	
	private String PassengerLastName;
	
	private int SeatNumber ;
	
	public OnlineBusReservation(String PassengerFirstName, String PassengerLastName, int SeatNumber){
		
		this.PassengerFirstName = PassengerFirstName ;
		
		this.PassengerLastName = PassengerLastName ;
		
		this.SeatNumber = SeatNumber ;
		
	}
	

	public String getPassengerFirstName() {
		return PassengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		PassengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return PassengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		PassengerLastName = passengerLastName;
	}

	public int getSeatNumber() {
		return SeatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		SeatNumber = seatNumber;
	}
	
	
	public int getSeatsLeft() {
		return SeatsLeft;
	}


	public void setSeatsLeft(int seatsLeft) {
		SeatsLeft = seatsLeft;
	}


	synchronized static void reserveSeats(int numberOfSeats){
		
				
		     if(SeatsLeft >= numberOfSeats ){
			
		        SeatsLeft = TotalSeats - numberOfSeats;
		
                 System.out.println("Booking Confirmed,Thanks for travelling with us, Have Safe journey !!!");
                
   			
   			     System.out.println("Number of Seats left in bus : "+ SeatsLeft);
   			     
   			     System.out.println("Number of Seats booked in bus : "+ numberOfSeats );
		
		     }
		
		     else{
			
			    System.out.println("Insufficient Seats, Booking unsuccessful");
			    
		     }
			

		}
		
}
