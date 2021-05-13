package login;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class resultdeclaration {
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int marks[];
		marks = new int[3];

		try {
			System.out.println("Enter marks of Subject A :");
			marks[0] = sc.nextInt();

			System.out.println("Enter marks of Subject B :");
			marks[1] = sc.nextInt();

			System.out.println("Enter marks of Subject C :");
			marks[2] = sc.nextInt();
			if(marks[0] >= 60 && marks[1] >= 60 && marks[2] >= 60)
			{
				System.out.println("Pased");
			}
			else if((marks[0]<=60 && marks[1]>=60 && marks[2]>=60)||(marks[0]>=60 && marks[1]<=60 && marks[2]>=60)||(marks[0]>=60 && marks[1]>=60 && marks[2]<=60))
			{
				System.out.println("promoted");
			}
			else if((marks[0]>=60 || marks[1]<=60 || marks[2]<=60)&&(marks[0]<=60 || marks[1]>=60 || marks[2]<=60)&&(marks[0]<=60 || marks[1]<=60 || marks[2]>=60))
			{
				System.out.println("fail..");
			}
			else if(marks[0] < 60 && marks[1] < 60 && marks[2] <60)
			{
				System.out.println("fail");
			}
		} catch (InputMismatchException ex) {
			
			ex.printStackTrace();
		}

	}
}
