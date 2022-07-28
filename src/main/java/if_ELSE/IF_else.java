package if_ELSE;


public class IF_else {

			
			public void getScore(int marks){  //value inside ()

				if(marks>=95) {System.out.println("A++");}  
				
				else if(marks>=80) {System.out.println("B");}
				
				else if(marks>=70) {System.out.println("c");}
				
				else {System.out.println("fail");}
			}
			
			public static void main(String[] args) {
				
				IF_else score =new IF_else();
			
		      score.getScore(80);
			}

		

	}


