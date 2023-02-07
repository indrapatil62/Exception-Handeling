package exceptionhandeling;
// try have error then only it will read catch block and finally will always get read at any cost.
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		try {
			System.out.println("Division is "+(num1/num2));
		}
		finally {
			System.out.println("Finally block always holds the code that should coumpulsory get executed");
		}
		System.out.println("hoik");
	}
}
