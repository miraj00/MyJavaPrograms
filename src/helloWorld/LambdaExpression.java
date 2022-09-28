package helloWorld;

import java.util.*;
public class LambdaExpression {
   public static void main(String[] args){
      ArrayList<Integer> my_arr = new ArrayList<Integer>();
      my_arr.add(190);
      my_arr.add(267);
      my_arr.add(12);
      my_arr.add(0);
      System.out.println("Before sorting, elements in the array list are : " + my_arr);
      Collections.sort(my_arr, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
      System.out.println("After sorting, elements in the array list are : " + my_arr);
   }
}
