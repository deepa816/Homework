package Practice_String;

public class int_String_Together {

	public static void main(String[] args) {
	
		
		String y = "United States OF America ";
		String z = "  State --> Texas";
		int a   =   5;
		int b   =   6;
		
		   System.out.println(y+z); //United States OF America  : State --> Texas
		
		   System.out.println(a+b); //11
		   
		  System.out.println(y+z+a+b); //United States OF America   State --> Texas56
		  
		   System.out.println(a+b+y+z); //11United States OF America   State --> Texas
		   
		   System.out.println(y+z+(a+b)); //United States OF America   State --> Texas11

	}

}
