
/*
 * 
 * Find names of 3 highest salary - created on 2nd May - Saravanan P
 */

package niit;
import java.util.*;
import java.util.stream.*;
public class Main {
public static void main(String[] args) {

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

for(int i=0;i<ec.getEmployee().size();i++)
{
	System.out.println(ec.getEmployee().get(i).getEno()+"   "+ec.getEmployee().get(i).getName()+"  "+ec.getEmployee().get(i).getSal());
	
}
	
List<Employee> employees=ec.getEmployee();

//Avoid mutating original array
//new list
List<Employee> copy=new ArrayList<>(employees);

//sort descending using comparator fun
copy.sort((o1,o2)->o2.getSal()-o1.getSal());
//get first 3
for (int i=0;i<3;i++)
{
	Employee e=copy.get(i);
	System.out.println(e.getName());
}


// java streams API

System.out.println("working with Streams API");
List<Employee> getemployees =ec.getEmployee();
getemployees.stream()
            .sorted(Comparator.comparingInt(Employee::getSal).reversed())
            .limit(3)
           // .map(Employee::getName)  or
            .map(emp->emp.getName())
            .forEach(System.out::println);
            
 // other way
System.out.println("to put name in the String");

List<String> highestpaid=new ArrayList<>();
Iterator <Employee> iterator=copy.iterator();
int count=0;
while(count<3 && iterator.hasNext()) {
	Employee e=iterator.next();
		String name=e.getName();
		highestpaid.add(name);
		count++;
	}
	System.out.println(highestpaid);
	
	// Java Stream API
	
List<Employee> employ=ec.getEmployee();
List<String>names
	=employ.stream()
	 .sorted(Comparator.comparingInt(Employee::getSal).reversed())
	 .limit(3)
	 .map(Employee::getName)
     .collect(Collectors.toList());
System.out.println(names);

// to set collection
/*
 * Set<String> setofEmps
 * 						=employ.stream()
 * 						 .limit(3)
 *                       .map(Employee::getName)
 *                       .collect(Collectors.toSet()); 
 */

//to Map collection
/*
* Map<String,Employee> empMap
* 						=employ.stream()
* 						 .limit(3)
*                        .collect(Collectors.toMap(e->e.name,e->e)); 
*/

//adding delimiter , between names
/*
* String names
* 						=employ.stream()
* 						 .limit(3)
*                        .map(Employee::getName)  
*                        .collect(Collectors.joining(delimiter:","); 
*/

// add one more column to the employee object called dept and then proceed group by dept
/*
* Map<String, List<Employee>> empbyDept
* 						=employ.stream()
* 						 .collect(Collectors.groupingBy(e->e.dept)); 
*/

//count employees in each dept
/*
* Map<String, Long> deptCount
* 						=employ.stream()
* 						 .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting())); 
*/

//Parallel Streams
/*
 * Map<String.List<Employee>empByDep
 *                        =employ.stream()
 *                         .parallel()
 *                         .collect(Collectors.groupingBy(e->e.dept));  
 * 
 * 
 */
// Parallel streams can process more than 10,000 elements, last Caveat is don't concurrently modify the soruce of stream (List, Set, etc).


}






}
