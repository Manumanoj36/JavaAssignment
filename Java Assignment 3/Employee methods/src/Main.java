import java.util.Map.Entry;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(1009,"Sam",30000,"sam@ok.com");
		Employee e2=new Employee(1020,"Ram",50000,"ram@ok.com");
		Employee e3=new Employee(1005,"King",20000,"king@ok.com");
		Employee e4=new Employee(1010,"Mongo",80000,"mongo@ok.com");
		
		Department d1 = new Department(10001,"IT","Boston");
		Department d2 = new Department(10003,"ECE","Haldwani"); 
		
		Map<Employee,Department> empDeptMap = new HashMap<>();
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d2);
		empDeptMap.put(e3, d1);
		empDeptMap.put(e4, d2);
		
		Set<Entry<Employee,Department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<Employee,Department>>iterator= entrySet.iterator();
		
		for(Entry<Employee,Department> entry:entrySet) {
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			
			System.out.println(employee);
			System.out.println(department);
			
		}
		
		
		
	}

}
