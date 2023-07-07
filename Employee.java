package Day11;

public class Employee {

	int id;
	String name;
	String city;
	double salary;
	
	public Employee(int id, String name,String city, double salary)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.salary=salary;
	}
	
	//@Override
//	public String toString()
//	{
//	 return "Employee[name=" +name +",id="+id +",city="+city+",salary="+salary+"]";
//	}

	
	public String toString()
	{
	  return name +" "+id ;
	}

}
 
   