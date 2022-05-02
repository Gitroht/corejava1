package iddemo;

import empldemo.Employee;

public class Empl {
	int id;
	String name;
	double salary;
	public Empl() {
		}
	public Empl(int id, String name,double salary) {
		this.id=id;
		this.name= name;
		this.salary= salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean equals(Object o) {
		if(o instanceof Empl) {
			return((Empl)o).name== this.name;
		}
		else
			return false;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name +", salary=" + salary + "]";
	}


	}



