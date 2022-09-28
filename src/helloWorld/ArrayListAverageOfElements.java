package helloWorld;

import java.util.*;     

public class ArrayListAverageOfElements  {  
	
	public static void main(String args[])   {  

		int sum = 0, avg;      
		ArrayList<Integer> list = new ArrayList<Integer>();    
															//adding elements to the List  
		list.add(12);  
		list.add(34);  
		list.add(10);  
		list.add(48);  
		list.add(65);  
															//loop iterates over the List  
		for(int i = 0; i < list.size(); i++)  
															//getting elements from the list and adding to the variable sum   
			sum = sum + list.get(i);  
															//finds the average of the list  
			avg = sum / list.size();   
															//prints the result  
			System.out.println("The average of the List: " + avg);  
	}  
}  
