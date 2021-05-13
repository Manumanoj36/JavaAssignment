import java.util.Scanner;
public class ArmstrongRange {
public static void main(String[] args) {
		
		int n1,n2,n,temp,i;
		int rem,count = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		n1 = s.nextInt();
		
		System.out.println("Enter second Number :");
		n2 = s.nextInt();
		
		for(i=n1+1; i<n2; i++)
		{
			temp =i;
			n=0;
			while(temp != 0)
			{
				rem = temp%10;
				n= n+(rem*rem*rem);
				temp = temp/10;
				
			}
			if(i==n)
			{
				if(count==0)
				{
					System.out.println("Arm strong no are :");
				}
				System.out.print(i + " ");
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("not found!!");
		}
	}

}


