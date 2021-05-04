package niit;
// model class 
public class Employee {
		
	
	public Employee(int eno, String name, int sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", sal=" + sal + "]";
	}

	private int eno;
	private String name;
	private int sal;

	
	public int getEno() {
		return eno;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}

	
	

}
