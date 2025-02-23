/*
// 1. Write a program to calculate the sum of the first 50 natural numbers. 

public class demo{
	
	public static void main(String args[]){

	int sum = 0 ;

	for(int i = 1 ; i <= 50 ; i++ ) {

		sum += i ;
	}
	
	System.out.println("The sum of 50 natural number is " + sum) ;
	}
}

*/

/*

// 2. Write a program to compute the factorial of the number 10. 

public class demo{
	
	public static void main(String args[]){

	int factorial = 1 ;

	for(int i = 1 ; i <= 10 ; i++ ) {

		factorial *= i ;
	}
	
	System.out.println("The factorial of 10 is " + factorial) ;
	}
}

*/


// 3. Write a program to print all multiples of 7 between 1 and 100

/*
public class demo{
	
	public static void main(String args[]){
		
		for(int i = 1 ; i <= 100 ; i++ ) {
		
			if(i % 7 == 0) {System.out.println(i) ;}
			

			}
	
	
	}
}
*/

// 4. Write a program to reverse the digits of the number 1234. The output should be 4321. 
/*
public class demo {
	public static void main(String args[]) {
	
	int i = 1234;
	int rev = 0; 
	int ld = 0;
	while(i != 0){
		
		ld = i%10;
		rev = rev*10 + ld;
		i = i/10 ;
	}
	System.out.println(rev);

	}
}
*/

// 5. Write a program to print the Fibonacci sequence up to the number 21. 
/*
public class demo {
	public static void main(String args[]) {
	
	int num1 = 0;
	int num2 = 1 ;
	
	while (num1 <= 21) {
		System.out.println(num1);
		int num3 = num1 + num2 ;
		num1 = num2;
		num2 = num3;
		
	}

	}
}
*/

// 6. Write a program to find and print the first 5 prime numbers. 
/*
public class demo {
	public static void main(String args[]) {
	
	int num = 6 ;
	int count = 0;
	for(int i = 1 ; i <= num ; i++ ) {
		if (num%i == 0) {	count += 1; } 
		
	
		}	
	if(count <= 2) {System.out.println("The given number is prime");}
	else { System.out.println("The given number is Composite");}
	
	}
}

*/

//7. Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 
/*
public class demo {
	public static void main(String args[]) {
	
	int i = 9876;
	int sum = 0;
	int num = 0;
	while(i != 0){	
		num = i%10;
		sum += num;
		i = i/10;
		}
	System.out.println(sum);
	}
}

*/

//8. Write a program to count down from 10 to 0, printing each number. 
/*
public class demo {
	public static void main(String args[]) {
	
	for(int i = 10 ; i >=0 ; i-- ){
	System.out.println(i);
	}

	}
}
*/
/*
// 9. Write a program to find and print the largest digit in the number 4825
public class demo {
	public static void main(String args[]) {
	
	int num = 4825;
	int max = 0 ;
	
	while( num!= 0 ) {
		int i = num % 10;
		if(i > max) { max = i ; }
		num = num/10 ;
	}
	System.out.println(max);
	}
}*/

// 10. Write a program to print all even numbers between 1 and 50
/*
public class demo {
	public static void main(String args[]) {
	
	for (int i = 1 ; i <=50 ; i++) {
		if(i%2 == 0){ System.out.println(i);}
	}

	}
}
*/

// 11. Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression 

/*
public class demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        int result = ++a - b-- + a-- - --b + a-- ;
        
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("Result : " + result);
    }
}
*/

/* 12. Write a program to draw the following pattern:
*****
*****
*****
*****
*****
*/
/*
public class demo {
	public static void main(String args[]) {
	
	for( int i = 1 ; i<= 5 ; i++) {
		for( int j = 1 ; j<=5 ; j++) {
			System.out.print("*");
		}
	System.out.println();
	
	} 
	}
}

*/

public class demo {
	public static void main(String args[]) {
	int num = 1;
	for( int i = 1 ; i<= 5 ; i++) {
		for( int j = 1 ; j<=i ; j++) {
			System.out.print(num);
		num++; 
		}
	System.out.println();
	
	} 
	}
}













