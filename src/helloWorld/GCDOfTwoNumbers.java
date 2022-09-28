package helloWorld;

import java.util.Scanner;

public class GCDOfTwoNumbers {
   public static void main(String args[]){
      int a, b, i, hcf = 0;
      try (Scanner sc = new Scanner(System.in)) 
        {
		System.out.println("Enter first number :: ");
		  a = sc.nextInt();
		  System.out.println("Enter second number :: ");
		  b = sc.nextInt();
	    }
      for(i = 1; i <= a || i <= b; i++) {
         if( a%i == 0 && b%i == 0 )
         hcf = i;
      }
      System.out.println("HCF of given two numbers is ::"+hcf);
   }
}


//An H.C.F or Highest Common Factor, is the largest common factor of two or more values.
//For example factors of 12 and 16 are −
//12 → 1, 2, 3, 4, 6, 12
//16 → 1, 2, 4, 8, 16
//The common factors are 1, 2, 4 and the highest common factor is 4.
//Algorithm
//•	Define two variables - A, B
//•	Set loop from 1 to max of A, B
//•	Check if both are completely divided by same loop number, if yes, store it
//•	Display the stored number is HCF
