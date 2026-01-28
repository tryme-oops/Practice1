package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class set1 {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		
		s.add(82);
		s.add(74);
		s.add(31); // .add is a boolean method will return false if unseccesfull meaning data is already present
		
		System.out.println("check if this value is already present, if present add method will fail : " + s.add(82));
	
		Iterator<Integer> value = s.iterator();
		
		while(value.hasNext()) {
			System.out.println(value.next());    //set do not maintain insertion orders, does not allow duplicate, although a TreeSet follows ascending insertion order
		}
		
		
		System.out.println("\nfind Duplicate elements in an array");
		
		String arr[] = {"Java", "JavaScript", "c#", "hashmap", "python", "Ruby", "Java", "c#"};
		
		Set<String> d = new HashSet<String>();
		
		for(int i = 0; i <= arr.length-1 ; i++ ) {
			String temp = arr[i];
			if(d.add(temp) != true) {
				System.out.println(temp);
			}
		}
		
		
		
	}

}
