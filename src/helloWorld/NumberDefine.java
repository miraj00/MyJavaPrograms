package helloWorld;


//Write a program if given number is positivie, negative or zero 

public class NumberDefine {

 public static void main(String args[]) {

 int number = -30;

 if (number<0) {
     System.out.println("The given number "+ number + " is negative");
 }
 else if (number==0) {
     System.out.println("The given number "+ number + " is zero");
 } 
 else if (number>0) {
     System.out.println("The given number "+ number + " is positive");
 } 
}
}
