package over_LR;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDem {
	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();

		Employee e1 = new Employee(12, "abc", "Pune");
		Employee e2 = new Employee(123, "xyz", "Mumbai");
		Employee e3 = new Employee(124, "Patil", "Delhi");

		l.add(e1);
		l.add(e2);
		l.add(e3);

		for (Employee e : l) {
			if(e.address.contains("Pune")) {
				e.setAddress("Hyderabad");
			}
			
			System.out.println(e.eId+ ", " +e.name+", " +e.address);
		}
		
		  List<Integer> ll = new ArrayList<Integer>();
		  
		  ll.add(10); ll.add(10); ll.add(30);
		  
		  for(Integer i:ll) {
			 // System.out.println(i); 
			  if(i.equals(new Integer(30))) {
		  }
		  System.out.println("matched the number");
		  
		  ll.set(1, 40); }
		  
		  System.out.println(ll);//10,40,30 }
		 

	}

}
