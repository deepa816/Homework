package Practice_String;

public class String_Char {

	/*
	 * 
	 * Two ways to create string 
	 * String literal etc : String s = "i like automating software";
	 * by using new memory operator. etc : String   st = new String("like automating software");
	 * Using String buffer and String builder
	 * 
	 */
	
	public static void main(String[] args) {
		
		String country ="United States Of America";
		
	     System.out.println("United States Of America   "   +country.length()); 
	     
	     System.out.println(country.charAt(11));
	     
	     System.out.println("I am first t " +country.indexOf("t"));
	     
	     System.out.println("I am second t " + country.indexOf("t",country.indexOf("t")+1));
	     
	     System.out.println("I am 3rd  t " + country.indexOf("t",country.indexOf("t",country.indexOf("t")+1)));
	     
	     System.out.println("I am last t " + country.lastIndexOf("t"));
	}

}
