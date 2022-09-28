package helloWorld;

import java.util.Scanner;

public class LCMOfTwoNumbers {
	   public static void main(String args[]){
	      int a, b, max, step, lcm = 0;
	      try (Scanner sc = new Scanner(System.in))
	      {
			System.out.println("Enter first number ::");
			  a = sc.nextInt();
			  System.out.println("Enter second number ::");
			  b = sc.nextInt();
		  }
	      if(a > b){
	         max = step = a;
	      }
	      else{
	         max = step = b;
	      }

	      while(a!= 0) {
	         if(max % a == 0 && max % b == 0) {
	            lcm = max;
	            break;
	         }
	         max += step;
	      }
	      System.out.println("LCM of given numbers is :: "+lcm);
	   }
	}


/*
L.C.M. or Least Common Multiple of two values is the smallest positive value which the multiple of both values.
For example multiples of 3 and 4 are:
3 → 3, 6, 9, 12, 15 ...
4 → 4, 8, 12, 16, 20 ...
The smallest multiple of both is 12, hence the LCM of 3 and 4 is 12.
Algorithm
•	Initialize A and B with positive integers.
•	 Store maximum of A & B to the max.
•	 Check if max is divisible by A and B.
•	 If divisible, Display max as LCM.
•	 If not divisible then step increase max, go to step 3.

*/


//import java.util.Scanner;
//public class MyClass {
//    public static void main(String args[]) {
//      
//     
//
//    int n1 = 72, n2 = 120, lcm;
//
//    // maximum number between n1 and n2 is stored in lcm
//    lcm = (n1 > n2) ? n1 : n2;
//
//    // Always true
//    while(true) {
//      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
//        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
//        break;
//      }
//      ++lcm;
//    }
//  }
//}

