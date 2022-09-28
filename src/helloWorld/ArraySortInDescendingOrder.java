package helloWorld;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;

public class ArraySortInDescendingOrder {
	   public static void main (String[] args) {
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(10);
	      list.add(50);
	      list.add(30);
	      list.add(20);
	      list.add(40);
	      list.add(60);
	      System.out.println("Original list : " + list);
	      Comparator<Integer> c = Collections.reverseOrder();
	      Collections.sort(list,c);
	      System.out.println("Sorted list using Comparator : " + list);
	   }
	}
