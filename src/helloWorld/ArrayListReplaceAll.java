package helloWorld;

import java.util.*;
public class ArrayListReplaceAll {
   public static void main (String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(7);
      list.add(1);
      list.add(3);
      list.add(1);
      System.out.println("Original list : " + list);
      Collections.replaceAll(list,1,4); // replacing elements with value 1 with value 4
      System.out.println("New list : " + list);
   }
}
