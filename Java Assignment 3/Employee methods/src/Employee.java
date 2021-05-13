public class Employee {
	private Integer employeeId;
	private String employeeName;
	private Integer salary;
	private String email;
	
	public Employee(Integer employeeId,String employeeName, Integer salary,String email)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.email = email;
	}
	public Integer getemployeeId(){
		return employeeId;
	}
	public String getemployeeName(){
		return employeeName;
	}
	public Integer getsalary(){
		return salary;
	}
	public String getemail(){
		return email;
	}

	public String toString()
    {
    	return "Employee [employeeId=" + employeeId + ", employeeName="+employeeName+", Salary"+salary+"]";
    }
	
	public int hashCode() {
		return 15;
	}
	public boolean equals (Object obj) {
		return true;
	}

}
