public class Employee {
	 	String name;
	 	int salary;
	 	int overtime;
	 	Employee()
	 	{
	 		name= null;
	 		salary =0;
	 	}
	 	Employee(String name, int salary)
	 	{
	 		this.name = name;
	 		this.salary = salary;
	 	}
	 	int getIncentive()
	 	{
	 		return salary;
	 	}
	 	int getOverTime()
	 	{
	 		return overtime;
	 	}
	
}


