package helloWorld;

import java.util.ArrayList;

public class ArrayListExistenceOfElement {
   public static void main(String[] args) {
      ArrayList<String> aList = new ArrayList<String>();
      aList.add("A");
      aList.add("B");
      aList.add("C");
      aList.add("D");
      aList.add("E");
      System.out.println("The element C is available in ArrayList? " + aList.contains("C"));
      System.out.println("The element Z is available in ArrayList? " + aList.contains("Z"));
   }
}
