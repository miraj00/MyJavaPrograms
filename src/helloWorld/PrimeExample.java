package helloWorld;


public class PrimeExample{    
	public static void main(String args[]){    
		int i,m=0,flag=0;      
		int n=3;//it is the number to be checked    
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		} else {  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number"); }  
		}//end of else  
	}    
}   


/*
Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.

Let's see the prime number program in java. In this java program, we will take a number variable and check whether the number is prime or not.
*/




//import java.util.Scanner;
//public class MyClass {
//    public static void main(String args[]) {
//    
//    int i, number, flag=0;
//    Scanner sc = new Scanner(System.in);
//     System.out.println( "Insert a number :");
//     number = sc.nextInt();
//     
//     if(number==0 || number==1)
//     System.out.println("The given number is not a prime number");
//     
//     if(number==2)
//     System.out.println("The given number is a prime number");
//     
//    for(i=2;i<number/2;i++)
//       {
//        if(number%i==0)
//          {
//           System.out.println("The given number is not a prime number");
//           flag=1;
//           break;
//          }
//        else 
//        flag=0; 
//        System.out.println("The given number is a prime number");
//        break;
//       }
//  
//  
//    }
//}    
