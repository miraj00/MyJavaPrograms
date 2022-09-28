package helloWorld;


import java.util.*;
public class ArrayListMaximumValue {
   public static void main (String[] args) {
      List<Integer> list = new ArrayList<Integer>();
      try {
         list.add(14);
         list.add(2);
         list.add(73);
         System.out.println("Maximum element : " + Collections.max(list));
      }
      catch (ClassCastException | NoSuchElementException e) {
         System.out.println("Exception caught : " + e);
      }
   }
}
