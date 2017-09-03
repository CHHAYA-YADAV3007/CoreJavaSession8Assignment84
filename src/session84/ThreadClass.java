package session84;

import java.util.*;

public class ThreadClass extends Thread {
	
	
	public void run(){
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList ls = new ArrayList();
		
		System.out.println("Enter number of seats that needs to be booked");
		
		int numberOfSeats = sc.nextInt();
		
		
		for(int i = 0 ; i< numberOfSeats ; i++){
			
		    System.out.println("Enter the Firstname of Passenger ");
			
		    String firstname = sc.next();
		 
		    System.out.println("Enter the Lastname of Passenger ");
		 
		    String lastname = sc.next();
		 
		 
		    OnlineBusReservation obj = new OnlineBusReservation(firstname ,lastname ,i+1);
		 
		    ls.add(obj);
				
		}
		
		OnlineBusReservation.reserveSeats(numberOfSeats);
		
		
		
		
		//Traversing list through Iterator  

		
		Iterator itr = ls.iterator();
		
		while(itr.hasNext()){
			
			OnlineBusReservation obr = (OnlineBusReservation)itr.next();
			
			System.out.println(obr.getPassengerFirstName() + " " + obr.getPassengerLastName()+ " "+ obr.getSeatNumber());
		}
		
		
	}
	
	

}
