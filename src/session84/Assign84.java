/**
 * 
5. Problem Statement
Write a Program to reserve tickets in an online bus reservation system using
synchronization. Program must have option for single thread to book multiple seats.
For each seat, the program must take a passenger name. Program should print
number of seats booked at the end as report.
6. Expected Output
The expected output should be displayed on the eclipse
*/
package session84;

/**
 * Write a Program to reserve tickets in an online bus reservation system using
 * synchronization. Program must have option for single thread to book multiple seats.
 * For each seat, the program must take a passenger name. Program should print
 * number of seats booked at the end as report.
 */

import java.lang.Thread;

import java.util.*;

public class Assign84 {
	
	public  static void main(String[] args){	
	
	       ThreadClass thr1 = new ThreadClass();
	
	       ThreadClass thr2 = new ThreadClass();
	       
	       thr1.start();
	       
	       try{
	    	   
	    	   thr1.join();
	       }
	       catch(Exception e){
	    	   
	    	   System.out.println(e);
	       }
	       
	       
	       thr2.start();
	       
	       try{
	    	   
	    	   thr2.join();
	       }
	       catch(Exception e){
	    	   
	    	   System.out.println(e);
	       }
	       
	     

	
	}
			

}
