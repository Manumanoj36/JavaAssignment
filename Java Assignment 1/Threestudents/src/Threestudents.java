import java.util.Scanner;

public class Threestudents {
		Scanner sc = new Scanner(System.in);
		int total=0,subjects,avg;
		String name;
		int marks[];
		Threestudents()
		{
			System.out.println("Enter Student name :");
			name = sc.next();
			getMarks();
		}
		public void getMarks() 
		{
			marks = new int[3];
			System.out.println("Enter marks of Subject A :");
			marks[0] = sc.nextInt();
			
			System.out.println("Enter marks of Subject B :");
			marks[1] = sc.nextInt();
			
			System.out.println("Enter marks of Subject C :");
			marks[2] = sc.nextInt();
			
			for(int i=0; i<3;i++)
			{
				total = total+marks[i];
			}
			System.out.println("Total marks of student " +name+ ": "+total);
			avg = total/3;
			System.out.println("avg marks of student " +name+ ": "+avg);
			System.out.println();
			
		}
		
		
	public static void main(String args[])
	{
		Threestudents s[] = new Threestudents[3];
		for(int i=0; i<3;i++)
		{
			s[i]= new Threestudents();
		}
	}
}
		

