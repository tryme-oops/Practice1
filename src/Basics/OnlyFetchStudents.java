package Basics;

import java.util.ArrayList;
import java.util.List;

public class OnlyFetchStudents {
	
	int rollNo;
	String Name;
	String Dept;
	
	public OnlyFetchStudents(int rollNo, String Name, String Dept) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.Dept = Dept;
	}
	
	public String getDept() {
		return Dept;
	}
	
	public String toString() {		
		return "rollNo: " + rollNo + " Name: " + Name + " Dept: " + Dept;
	}
	
	
	public static void main(String[] args) {
		OnlyFetchStudents s1 = new OnlyFetchStudents(0, "Shyam", "Commerce");
		OnlyFetchStudents s2 = new OnlyFetchStudents(1, "Raju", "Science");
		OnlyFetchStudents s3 = new OnlyFetchStudents(2, "babu", "Arts");
		
		List<OnlyFetchStudents> l = new ArrayList<OnlyFetchStudents>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		for(OnlyFetchStudents s : l ) {
			if("Science".equals(s.getDept())) {
				System.out.println(s.toString());
			}
		}
		
	}

}
