package helloWorld;


import java.util.*;
public class ArrayListReplaceAllWithFill {
   public static void main (String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);
      list.add(2);
      list.add(7);
      Collections.fill(list,98);
      System.out.println(list);
   }
}
