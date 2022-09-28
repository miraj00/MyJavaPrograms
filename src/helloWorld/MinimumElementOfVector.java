package helloWorld;


import java.util.Collections;
import java.util.Vector;
public class MinimumElementOfVector {
   public static void main(String args[]) {
      Vector<Integer> vec = new Vector<Integer>();
      vec.add(7);
      vec.add(3);
      vec.add(9);
      vec.add(5);
      vec.add(8);
      System.out.println("The Vector elements are: " + vec);
      System.out.println("The minimum element of the Vector is: " + Collections.min(vec));
   }
}
