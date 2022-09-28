package helloWorld;

//Write a program to find whether a given number is divisible by 2 & 5

import java.util.Scanner;

public class DivisibleByTwoValues {

  public static void main(String args[]) {

 int num;
 try (Scanner sc = new Scanner(System.in)) {
	System.out.println( "Please provide a number : ");
	     num =sc.nextInt();
}
 
 if (num%2==0 && num%5==0) {
 System.out.println("The Given Number : " + num + " is divisible by 2 and 5");
}
else {
 System.out.println("The Given Number : " + num + " is NOT divisible by 2 and 5" );
 }
}
}
