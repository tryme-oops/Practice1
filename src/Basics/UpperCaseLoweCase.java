package Basics;

public class UpperCaseLoweCase {

	public static void main(String[] args) {
	
		String str = "Priyata Saha";
		int upper = 0;
		int lower = 0;
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {		
			char ch = arr[i];
			
			if(ch >= 'A' && ch <= 'Z') {
				upper ++;
			}			
			else if(ch >= 'a' && ch <= 'z'){
				lower++;
			}
			
		}
		
		System.out.println(upper + " and " + lower);
			
	}

}
