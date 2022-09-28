package helloWorld;

// -------------- Using While Loop -------------------------------------

import java.util.Scanner;  
	
	public class SumOfTheNumbers   {  
		public static void main(String args[])  {  
			int number, digit, sum = 0;  
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter the number: ");  
				number = sc.nextInt();
			}  
			while(number > 0)  
			{  
				//finds the last digit of the given number    
				digit = number % 10;  
				//adds last digit to the variable sum  
				sum = sum + digit;  
				//removes the last digit from the number  
				number = number / 10;  
			}  
			//prints the result  
			System.out.println("Sum of Digits: "+sum);  
		}  
	}  

/*
	Suppose, we have to find the sum of digits of the number (N) 674.
	4
	First iteration
	674 % 10 = 4
	Sum = 0 + 4 = 4
	674 / 10 = 67
	Second iteration
	67 % 10 = 7
	Sum = 4 + 7 = 11
	67 / 10 = 6
	Third iteration
	6 % 10 = 6
	Sum = 11 + 6 = 17
	6 / 10 = 0
	Now the number (N) has become 0. So, we will not process it further. Hence, we get 17 as the sum of digits of the number 674.
*/	
		
	
//---------------------Using For Loop -----------------------------------
/*	
import java.util.Scanner;  

public class SumOfTheNumbers {
	
	public static void main(String arg[])  {  
		long number, sum;  
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");  
			//reads a long number from the user  
			number=sc.nextLong();
		}  
		//executes until the condition number!=0 becomes false  
		for(sum=0; number!=0; number=number/10)  
		{  
			//finds the last digit and add it to the variable sum      
			sum = sum + number % 10;  
		}  
		//prints the result  
		System.out.println("Sum of digits: "+sum);  
	}  
}  
	
*/
	
//-----------------------Using Function ------------------------------------------
/*
public class SumOfTheNumbers {  
	//function that finds the sum of digits of a number  
	static int findSum(int number)  {     

		//variable that stores the sum      
		int sum = 0;  
		//executes until the condition becomes false  
		while (number != 0)  {  
			//finds the last digit from the number and add it to the variable sum      
			sum = sum + number % 10;  
			//removes the last digit  
			number = number/10;  
			}  
		//returns the sum  
		return sum;  
		}  
		//driver code  
	public static void main(String args[])  {  
		int number = 5678;  
		//calling the user-defined method and prints the result   
		System.out.println("The sum of digits: "+findSum(number));  
	}  
}  
*/
//-------------------------Using For Loop ----------------------------------------------------
/*	
public class SumOfTheNumbers  {  
		//function that finds the sum of digits of a number  
	static int findSum(int number)  {  
		//variable that stores the sum          
		int sum;      
		//calculates sum in a single line  
		for (sum = 0; number > 0; sum = sum + number % 10, number = number / 10);  
		//returns the sum  
		return sum;  
	}  
	//driver code  
	public static void main(String args[])  {  
		int number = 7812089;  
		//calling the user-defined method and prints the result   
		System.out.println("The sum of digits: "+findSum(number));  
	}  
}  
*/
//-------------------Using Recursion---------------------------------------------------------
/*
public class SumOfTheNumbers  {  
	//function that finds the sum of digits of a number  
	static int findSum(int number)  {  
		//returns sum      
		//if number is not equal to 0 then execute code after colon (:), else print 0    
		//the method findSum() is recursively called  
		return number == 0 ? 0 : number % 10 +findSum(number/10) ;  
	}  
	//driver code  
	public static void main(String args[])  {  
		int number = 1234567;  
		//calling the user-defined method and prints the result   
		System.out.println("The sum of digits: "+findSum(number));  
	}  
}
*/
//   ============================================================
/*
import java.util.Scanner;  
public class SumOfTheNumbers  {  
	//variable that stores the sum              
	int sum=0;  
	//function that finds the sum of digits of a number  
	int sum(int number)  {  
		//executes until the statement returns false      
		if(number != 0)  {  
			//finds the last digit from the number and add it to the variable sum          
			sum = sum + number % 10;  
			//removes the last digit by diving the number by 10  
			number = number / 10;  
			//function recursively called  
			sum(number);  
		}  
		//returns sum  
		return sum;  
	}  
	public static void main(String args[])  {  
		int number;  
		SumOfDigitsExample6 sod = new SumOfDigitsExample6();  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number: ");  
		//reads an integer from the user  
		number=sc.nextInt();  
		//calling the user-defined method and prints the result   
		System.out.println("The sum of digits: "+sod.sum(number));  
	}  
}  
*/