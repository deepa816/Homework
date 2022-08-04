package Array_Concept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Array_List {

	public static <E> void main(String[] args) {
		
		 LinkedList <Integer> al2 = new   LinkedList <Integer>();
		 LinkedList <Boolean>  al3 = new   LinkedList <Boolean>();
		 LinkedList  <E> al5 =      new   LinkedList <E >();
		 
		 
		 
		 LinkedList  <Object> al4 = new   LinkedList <Object >();
		 
		 School_Student studentOne = new School_Student("Dilshad",27,"Bangla");//name age dept
		 School_Student studentTwo = new School_Student("Sharmin",22,"English");
		 School_Student studentThree = new School_Student("Nasrin",23,"math");
		 School_Student studentFour = new School_Student("Shirin",29,"science");
		 
		 al4.add(studentOne);
		 al4.add(studentTwo);
		 al4.add(studentThree);
		 al4.add(studentFour);
		 
		 
		//Iterator //
	      
		   Iterator <Object> it = al4.iterator();
		   
		      while (it.hasNext()) {
		    	  School_Student  st = (School_Student) it.next();
		    	  System.out.println( st.name);
		    	  System.out.println( st.age);
		    	  System.out.println( st.dept);
	              
		      }
		 
		 
	}

}
