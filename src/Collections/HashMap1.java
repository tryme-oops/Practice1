package Collections;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("Debdeep", 1);
		hm.put("Priyata", 1);
		
//		System.out.println(hm);
//		
//		System.out.println(hm.containsKey("Debdeep"));
//		System.out.println(hm.containsValue(2));
//		
//		System.out.println(hm.get("Priyata"));
		hm.put("test", hm.getOrDefault("test", 0));
		hm.put("Debdeep", hm.getOrDefault("Debdeep", 0)+1);
		
		
		
		System.out.println(hm.keySet());   //keySet() returns all the keys of the Set
		System.out.println(hm.values());   //returns values of the Set
//		hm.putIfAbsent("John", 3);
		
//		System.out.println(hm);
		
		
	}

}
