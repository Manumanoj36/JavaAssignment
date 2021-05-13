class Labour extends Employee
{
	int overtime;
	String name;
	Labour(String name, int overtime)
	{
		this.name = name;
		this.overtime = overtime;
	}
	int getOverTime()
	{
		return (overtime);
	}

}

