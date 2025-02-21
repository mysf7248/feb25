public class passorfail{
	public static void main(String args[]) {

		int phyMarks = 100;
		int chemMarks = 100; 
		int mathMarks = 55;
	
		if ( phyMarks >= 40 && chemMarks >= 40 && mathMarks >= 40 ) {
			
			System.out.println("Pass"); 
		}

		else {
			int failCount = 0;

			if ( phyMarks < 40 ) { failCount += 1; } 
			if (chemMarks < 40 ) { failCount += 1; }
			if (mathMarks < 40 ) { failCount += 1;}
			
			System.out.println("The student is failed in " + failCount + " subject." );
		}

	}

}