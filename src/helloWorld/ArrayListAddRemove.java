package helloWorld;

import java.util.ArrayList;

public class ArrayListAddRemove { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.get(1));
    cars.set(2, "Toyota");
    System.out.println(cars);
    cars.remove(1);
    System.out.println(cars);
    System.out.println(cars.size());
    
 } 
}
