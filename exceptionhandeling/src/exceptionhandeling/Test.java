package exceptionhandeling;
// If try dont have errors then it will print sysout which are above to try and go to try and afer go to next function
//once he rich the main function it will return and print sysout statement which are below the catch ,it will not enter
//in catch.
import java.util.Scanner;

public class Test {
	
	public void function1(int num1,int num2)
	{
		try {
			function2(num1,num2);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Addition is "+(num1+num2));
//		function2(num1,num2);
//		System.out.println("Addition is "+(num1+num2));
	}
	public void function2(int num1,int num2)
	{
		System.out.println("Substraction is "+(num1-num2));
		try {
			function3(num1,num2);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("In substraction...");
//		function3(num1,num2);
//		System.out.println("Substraction is "+(num1-num2));
	}
	public void function3(int num1,int num2)
	{	
		try {
			System.out.println("Division is "+(num1/num2));
		}catch (Exception e) {
			System.out.println(e);
		}
//		System.out.println("Division is "+(num1/num2));
//		System.out.println("In division....");
	}
	public static void main(String[] args) {
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		Test t=new Test();
		t.function1(num1,num2);
	/*	try {
			t.function1(num1,num2);
		}catch (Exception e) {
			System.out.println(e);
		}*/
       System.out.println("In main method");
	}

}

