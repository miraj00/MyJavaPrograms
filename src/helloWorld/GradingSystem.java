package helloWorld;

//Write a program to provide grading system : if 40-50 = D, 50-60=c, 60-70=b, 70-80=a, 80-90=a-, 90-100=a+

import java.util.Scanner;

public class GradingSystem {

  public static void main(String args[]) {

 int num;
 try (Scanner sc = new Scanner(System.in)) {
	System.out.println( "Please provide a grade number : ");
	     num =sc.nextInt();
}
 
 if(num >=40 && num <=50) {
     System.out.println("Student has grade : D"); 
     }
 else if(num >=51 && num <=60) {
     System.out.println("Student has grade : C"); 
     }
 else if(num >=61 && num <=70) {
     System.out.println("Student has grade : B"); 
     }
 else if(num >=71 && num <=80) {
     System.out.println("Student has grade : A"); 
     }
 else if(num >=81 && num <=90) { 
     System.out.println("Student has grade : A-"); 
     }
 else if(num >=91 && num <=100) {
     System.out.println("Student has grade : A+"); 
     }
 }
}

