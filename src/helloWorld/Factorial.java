package helloWorld;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
    												//  Logic :   n * n-1 * n-2 .......
      int i, n, fact=1;
      try (Scanner sc = new Scanner(System.in)) {
		System.out.println( "Insert a number :");
		  n = sc.nextInt();
	}
      for ( i=n; i>=1; i--){
    	  fact = fact*i;
      }
      
      System.out.println("The factorial of the given number is :" +fact);   
    }
}


/*
public class Factorial {
    public static void main(String args[]) {
      
	int i,fact=1;  
  	int number=5;                      //It is the number to calculate factorial    
  
  	for(i=1;i<=number;i++){    
      fact=fact*i;    
  	}    
  	System.out.println("Factorial of "+number+" is: "+fact);    
	}  
}

*/
