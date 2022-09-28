package helloWorld;

import java.util.*;
public class ArrayListSwap {
   public static void main (String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      System.out.println("Original list : " + list);
      Collections.swap(list, 3, 1); // swapping element at index 3 i.e. 40 and index 1 i.e. 20
      System.out.println("List after swapping : " + list);
   }
}
