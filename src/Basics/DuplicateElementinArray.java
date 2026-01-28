package Basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "Java", "JavaScript", "c#", "hashmap", "python", "Ruby", "Java" };
		
		System.out.println("******Using HashSet******");
		
		Set<String> S = new HashSet<String>();
		
		for(String name : arr) {
			if(S.add(name) == false) {  //Hashset only accepts unique values.
				System.out.println(name);
			}
		}
		
		System.out.println("******Using HashMap******");
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name : arr) {
		Integer count =	storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		
		//get the values from HashMap
		
	    Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println("Returning key = value format : " + entry);
				System.out.println(entry.getKey());
			}
			
		}
		
		System.out.println("new Practice");
		
	//String arr[] = { "Java", "JavaScript", "c#", "hashmap", "python", "Ruby", "Java" };
		Set<String> s = new HashSet<String>();
		for(String store : arr ) {
			if(s.add(store) != true) {
				System.out.println(store);
			}
				
		}
		

	}

}
