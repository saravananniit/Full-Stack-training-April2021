package niit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCreation {
	
	List<Employee> 	employees=new ArrayList();
	
	public  void employeeCreation(Employee e)
	{
		employees.add(e);
		
	}
    public List<Employee> getEmployee()
    {
	return employees;
    }

}
