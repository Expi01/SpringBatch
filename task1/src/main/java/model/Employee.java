package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer id;
	private String name;
	private String dept;
	private Integer salary;
	
	public Employee(Integer id, String name, String dept, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Employee{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", dept='").append(dept).append('\'');
		sb.append(", salary='").append(salary);
		sb.append('}');
		return sb.toString();
	}

	
	     
}
