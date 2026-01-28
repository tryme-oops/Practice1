package Collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		 ArrayList<String> a = new ArrayList<>();

	        // 1. Adding elements to ArrayList at the end
//	        a.add("java");
//	        a.add("Selenium");	        
//	        System.out.println(a);
//        
//	        a.remove(0);  //removing element by index value
//	        System.out.println(a);
//	        
//	        a.add("c#");
//	        System.out.println(a);
//	        
//	        a.set(1, "Pyhton");   //setting value by index
//	        System.out.println(a);
//	        
//	        System.out.println(a.size());      //size of arraylist
		 
		 a.add("January");
		 a.add("Feburuary");
		 a.add("March");
		 a.add("May");
		 
		 a.add(3, "April");
		 
		 System.out.println(a);

	}

}
