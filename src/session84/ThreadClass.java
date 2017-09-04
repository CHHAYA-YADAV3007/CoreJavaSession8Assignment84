/**
 *   ThreadClass.java  1.1 04-Sept-2017
 */
//package declaration
package session84;

//importing java.util package in order to use Collection ArrayList Class

import java.util.*;

/**
 * This class will inherit the Thread Class and implement run method  for thread instances.
 * 
 * This class will provide definition to display the Passenger details booked by each thread instance.
 * 
 * version 1.1
 * 
 * @author chhaya yadav
 * 
 * Compiled on 04-Sept-2017
 *
 */

//Child Class ThreadClass inheriting Parent Thread Class

public class ThreadClass extends Thread {
	
//definition of run method invoked by each thread instance
	
public void run(){
	
//Scanner class instantiation to take user input 	
		
		Scanner sc = new Scanner(System.in);
		
//Java ArrayList class instantiation and initialization to store passenger details
		
		ArrayList ls = new ArrayList();
		
		
		System.out.println("Enter number of seats that needs to be booked. ");
		
//Taking total number of passengers as user input at runtime
		
		int numberOfSeats = sc.nextInt();
		
//Take the passenger details for each passenger for booking
		
		for(int i = 0 ; i< numberOfSeats ; i++){
			
		    System.out.println("Enter the Firstname of Passenger ");
		    
//Take the Passenger FirstName as user input at runtime		    
			
		    String firstname = sc.next();
		 
		    System.out.println("Enter the Lastname of Passenger ");
		    
//Take the Passenger Last Name as user input at runtime		    
		 
		    String lastname = sc.next();
		 
//Instantiation and initialization for each passenger object of OnlineBusReservation class
		    
		    OnlineBusReservation pass = new OnlineBusReservation(firstname ,lastname ,i+1);
		    
//Populating the ArrayList instance ls	with each passenger object	of OnlineBusReservation class    
		 
		    ls.add(pass);
				
		}

//Calling the static method of 	OnlineBusReservation class  for booking confirmation
		
		OnlineBusReservation.reserveSeats(numberOfSeats);
		
		
		System.out.println("Booking Details by current Thread ");
		System.out.println("_____________________________________________________");
		
//Traversing Arraylist through Iterator and print the passenger details booked by each thread 

		
		Iterator itr = ls.iterator();
		
		while(itr.hasNext()){
			
			OnlineBusReservation obr = (OnlineBusReservation)itr.next();
			
//Fetch the passenger details by get  methods declared in OnlineBusReservation class for each instance			
			
			System.out.println(obr.getPassengerFirstName() + " " + obr.getPassengerLastName()+ " ");
		}
		
		System.out.println("_____________________________________________________");
		
		
	}
	
	

}
