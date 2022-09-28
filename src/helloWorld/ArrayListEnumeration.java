package helloWorld;


import java.util.*;
public class ArrayListEnumeration {
   public static void main (String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(14);
      list.add(2);
      list.add(73);
      Enumeration<Integer> en = Collections.enumeration(list); // getting enumeration over ArrayList list
      while(en.hasMoreElements()) {
         System.out.println(en.nextElement());
      }
   }
}
