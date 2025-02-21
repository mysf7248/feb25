public class calci{

	public static void main(String args[]){

		int a = 2;
		int b = 5;
		String opr = "/";

		if (b == 0) { 
			System.out.println("Division by Zero Error :( ") ; 
			}

		else { 

			switch(opr) {

				case "+" :
					System.out.println(a+b); 
					break;
				case "-" :
					System.out.println(a-b); 
					break;
				case "*" :
					System.out.println(a*b); 
					break;
				case "/" :
					System.out.println((float)a/(float)b); 
					break;
				default:
					System.out.println("Enter Valid Operator"); 
					break;
			}
		}
	}
}