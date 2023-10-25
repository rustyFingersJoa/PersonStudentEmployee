package PersonStudentEmployee;

public class Employee extends Person implements Comparable<Employee>, Cloneable{

	private double salary;
	private String departmentName;
	
	
	public Employee() {
		super();
		salary = 0;
		departmentName = "Precinct 47";
	}
	
	public Employee(String name, int age, double salary, String departmentName) {
		super(name, age);
		this.setSalary(salary);
		this.setDepartmentName(departmentName);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	@Override
	public int compareTo(Employee o) {
		if (this.salary > o.salary)
			return 1;
		else if (this.salary < o.salary)
			return -1;
		else 
			return 0;			
	}
	
	//override
	public String toString() {
		return super.getName() + ", " + super.getAge() + ", " + salary + ", " + departmentName;
	}
	
	//override
	public boolean equals(Object obj) {
		if (obj instanceof Employee)
			return this.departmentName == ((Employee)obj).departmentName;
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		try {
		return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	

}
