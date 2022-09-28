package helloWorld;

import java.util.Scanner;

public class ReversalOfTheWord {
    public static void main(String args[]) {
     String name=""; 
     String reverse;

     Scanner sc = new Scanner(System.in);
     System.out.println( "Insert a word :");
     name = sc.nextLine();  
     
        int a = name.length();
   for (int i = a-1;i>=0;i--){
      reverse = name + charAt(i);
      System.out.println("The reversal of the word is :" +reverse);
    }
 }

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
