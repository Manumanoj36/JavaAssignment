public class Department {
	private Integer deptId;
	private String deptName;
	private String deptLocation;

	public Department(Integer deptId,String deptName,String deptLocation)
	{
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
	
	public String toString()
    {
    	return "Department [deptId=" + deptId + ", deptName="+deptName+ "]";
    }
}

