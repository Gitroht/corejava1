package Salary;

public class salr {
	
		int id;
		String name;
		double salary;
		public salr() {
			}
		public salr(int id, String name,double salary) {
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
			if(o instanceof salr) {
				return((salr)o).salary== this.salary;
			}
			else
				return false;
		}
		public String toString() {
			return "Employee [id=" + id + ", name=" + name +", salary=" + salary + "]";
		}


		}



