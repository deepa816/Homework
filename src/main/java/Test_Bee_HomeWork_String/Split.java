package Test_Bee_HomeWork_String;

public class Split {

	public static void main(String[] args) {
		
	//	 Split method will return an array of String.
			
			   String x ="I love JAVA";
			String  j [] =  x.split(" ");
			
			for (int i=0;i<j.length;i++ ) {
				
				 System.out.println("---> "+ j[i]);
				 
				 
				 String Country = "United States OF America";
				 String [] ct = Country.split (" ");
				 System.out.println(ct.length);
				
			}

	}

}
