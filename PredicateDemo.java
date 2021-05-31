package in.chetan.predicate.employee1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateDemo {

	final static Map<Integer,Employee> map  =new HashMap<>();
	static int count = 1;
	public static void main(String[] args) {
		
	List<Employee> empList = new ArrayList<>();
	empList.add(new Employee("John",12000));
	empList.add(new Employee("Smith",10000));
	empList.add(new Employee("David",18000));
	empList.add(new Employee("Miller",15000));
	empList.add(new Employee("Joe",13000));
	
	Predicate<Employee> empPredicate = e->e.empSalary>13000;
	
	for (Employee employee : empList) {
		if(empPredicate.test(employee)) {
			 map.put(count, employee);
			 count++;
		}
	}
     
	System.out.println(map);
	}

}
