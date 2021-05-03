
/*
 * 
 * Find names of 3 highest salary in the given employee list - created on 2nd May - Saravanan P
 */

package niit;
import java.util.*;
import java.util.stream.*;
public class Main {
public static void main(String[] args) {
Employee e6=new Employee(15,"Valli",9000);
Employee e1=new Employee(13,"sam",8000);
Employee e2=new Employee(12,"som",2000);
Employee e3=new Employee(11,"ram",1000);
Employee e4=new Employee(16,"hari",5000);
Employee e5=new Employee(21,"sita",1500);

EmployeeCreation ec=new EmployeeCreation();

ec.employeeCreation(e1);
ec.employeeCreation(e2);
ec.employeeCreation(e3);
ec.employeeCreation(e4);
ec.employeeCreation(e5);


for(int i=0;i<ec.getEmployees().size();i++)
{
	System.out.println(ec.getEmployees().get(i).getEno()+"   "+ec.getEmployees().get(i).getName()+"  "+ec.getEmployees().get(i).getSal());
	
}

List<Employee> employees=ec.getEmployees();

//Avoid mutating original array
//create a new list
List<Employee> copy=new ArrayList<>(employees); //type casting

//sort descending using comparator fun
copy.sort((o1,o2)->o2.getSal()-o1.getSal());   
//get first 3
for (int i=0;i<3;i++)
{
	Employee e=copy.get(i);
	System.out.println(e.getName());
}

System.out.println("working with Streams API");
List<Employee> getemployees =ec.getEmployees();
getemployees.stream()
            .sorted(Comparator.comparingInt(Employee::getSal).reversed())  // static method
            .limit(3)
           // .map(Employee::getName)  or //static method
            .map(emp->emp.getName())   //lambda expression
            .forEach(System.out::println);  //static method
        







}
}