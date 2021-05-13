package armstrongnumber;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,arm=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value :");
		int n = s.nextInt();
		temp = n;
		while(n>0)
		{
			int a = n%10;
			n= n/10;
			arm = arm + (a*a*a); 
			
		}
		if(temp == arm)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not armstrong number");
		}
	}

}

