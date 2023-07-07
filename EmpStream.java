package Day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpStream {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(10,"Prakash","Mumbai",20000));
		emp.add(new Employee(18,"Rahul","Pune",10000));
		emp.add(new Employee(21,"Virat","Mumbai",30000));
		emp.add(new Employee(11,"Kunal","Noida",35000));
		emp.add(new Employee(10,"Vishal","Nagpur",40000));
		
		//Filter operation by city
		List<Employee> mum = emp.stream()
				.filter(employe -> employe.city.equals("Mumbai"))
			     .collect(Collectors.toList());
		//Map
	List<String> empName = emp.stream()
			.map(employe -> employe.name)
			.collect(Collectors.toList());
	
	//Count the number of employees
		Long empCount = emp.stream().count();
		
		//Sort employee by id
	List<Employee> sortId =emp.stream()
			.sorted(Comparator.comparingInt(employe -> employe.id))
			.collect(Collectors.toList());
	
		System.out.println("Employee from Mumbai : "+ mum);
		System.out.println("Employee names : "+empName);
		System.out.println("Number of employees : "+empCount);
		System.out.println("sorted employees by id : "+sortId);
		sortId.forEach(a -> System.out.println(a));
		
	}
}
