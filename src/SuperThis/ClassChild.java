package SuperThis;

public class ClassChild extends ClassParent {
	
	String str = "Child Class";
	
	public void print() {
		
		System.out.println(str);
		
		System.out.println(this.str);
		
		System.out.println(super.str);
	}
	
	public static void main(String[] args) {		
		
		ClassChild c = new ClassChild();
		c.print();
	}

}
