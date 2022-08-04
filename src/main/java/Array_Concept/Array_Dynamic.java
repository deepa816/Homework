package Array_Concept;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Dynamic {

	public static void main(String[] args) {
		
		 
		 //Dynamic 
		 
		 /*
		  * its dynamic array 
		  * can contain duplicate value or elements
		  * Synchronized /Thread safe 
		  * preserve insertion order 
		  * 
		  * 
		  * 
		  */
		 
		 ArrayList  al = new  ArrayList();
		
		
		 
		 al.add(1);//0
		 al.add("dilshad");//1
		 al.add(2.50);//2
		 al.add(true);//3
		 al.add("deepa");//4
		
		 
		 
		 
	System.out.println("arry size "+al.size());//arry size 5
	System.out.println(al.get(4)); //deepa

	//How to print an array

	  // for loop 
	                   

	    for (int i =0; i<al.size();i++) {
	    	
	    	System.out.println(al.get(i));
	    	
	    }
	    System.out.println("**************");
	    // iterator 
	       //next 
	      //hasNext 
	      
	    Iterator   its = al.iterator();
	    
	  	 while (its.hasNext()) {
	  		 
	  		 System.out.println("using iterator "+ its.next());
	  	 }

	}

}
