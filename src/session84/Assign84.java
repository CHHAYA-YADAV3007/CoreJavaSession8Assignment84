/**
 * Assign84.java 1.1 04-Sept-2017
 */
//package declaration
package session84;

//importing Thread class and its methods from java.lang package

import java.lang.Thread;
/**
 * This class illustrates the main program to reserve tickets in an online bus reservation system using
 * synchronization.
 * This Program has option for single thread to book multiple seats.
 * For each seat, the program must take a passenger name. Program should print number of seats booked
 *  at the end as report.
 *  
 *  version 1.1
 *  
 *  Compiled on 04-Sept-2017
 *  
 *  @author Chhaya Yadav
*/

//main class declaration and definition

public class Assign84 {

//main method declaration and definition
	
	public  static void main(String[] args){
		
//Instantiation & Initialization of child class ThreadClass of parent Thread class	
		
//Creation of first thread object of ThreadClass
		
	       ThreadClass thr1 = new ThreadClass();
	       
//Creation of second thread object of ThreadClass	       
	
	       ThreadClass thr2 = new ThreadClass();
	       
//Below method starts the execution of the thread object thr1.JVM calls the run() method on this thread.	       
	       
	       thr1.start();
	       
//Join method will pause all other threads and execute Thread thr1 only , until it finishes.	       
	       
	       try{
	    	   
	    	   thr1.join();
	       }
	       catch(Exception e){
	    	   
	    	   System.out.println(e);
	       }
	       
//Below method starts the execution of the thread object thr2.JVM calls the run() method on this thread.
	       
	       thr2.start();
	       
//Join method will pause all other threads and execute Thread thr2 only , until it finishes.	       
	       
	       try{
	    	   
	    	   thr2.join();
	       }
	       catch(Exception e){
	    	   
	    	   System.out.println(e);
	       }
	       
	     

	
	}
			

}
