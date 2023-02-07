package exceptionhandeling;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Addition is "+(num1+num2));
		
		int num[]= {1,2,3,4,5};
		
		for(int i=0;i<num2;i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("Handling Errors is an art....");

	}

}

