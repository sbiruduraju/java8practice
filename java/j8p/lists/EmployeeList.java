package j8p.lists;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private Integer id;
	private String name;
	private Integer age;
	private Double salary;
	private String department;
	private Integer mgrId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getMgrId() {
		return mgrId;
	}
	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}
	public Employee() {}
	public Employee(Integer id, String name, 
			Integer age, 
			Double salary, 
			String department, 
			Integer mgrId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.mgrId = mgrId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name 
				+ ", age=" + age + ", salary=" + salary 
				+ ", department=" + department + ", mgrId=" 
				+ mgrId + "]";
	}
	
}

public class EmployeeList {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee emp = new Employee(1,"Kumar",25,10000.00,"Dev",11);
		empList.add(emp);
		
		emp = new Employee(2,"Raju",35,20000.00,"Dev",12);
		empList.add(emp);
		
		emp = new Employee(3,"Kapoor",45,30000.00,"Test",13);
		empList.add(emp);
		
		empList.stream().filter(e->e.getDepartment().startsWith("D"))
		.forEach(f->System.out.println(f.getName()));
		
		empList.stream().filter(e->e.getDepartment().equalsIgnoreCase("test"))
		.filter(e->e.getAge()>25)
		.forEach(System.out::println);
	}
}
