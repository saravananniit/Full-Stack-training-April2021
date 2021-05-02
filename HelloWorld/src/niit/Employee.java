package niit;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	

	public Employee(int eno, String name, int sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.sal=sal;
	}
	private int eno;
	public int getEno() {
		return eno;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	private String name;
	private int sal;
	


}
