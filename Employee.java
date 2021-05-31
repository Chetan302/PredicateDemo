package in.chetan.predicate.employee1;

public class Employee {

	public String empName;
	public double empSalary;
	
	
	public Employee(String empName, double empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + "]";
	}


	
	
	

}
