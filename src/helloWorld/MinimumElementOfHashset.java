package helloWorld;

import java.util.*;

public class MinimumElementOfHashset {
   public static void main(String args[]) {
      // create hash set
      Set<Integer> hs = new HashSet<Integer>();
      hs.add(29);
      hs.add(879);
      hs.add(88);
      hs.add(788);
      hs.add(456);
      System.out.println("Elements in set = "+hs);
      // finding minimum element
      Object obj = Collections.min(hs);
      System.out.println("Minimum Element = "+obj);
   }
}
