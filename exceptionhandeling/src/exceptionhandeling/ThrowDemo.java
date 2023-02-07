//package exceptionhandeling;
//
//import java.util.Scanner;
//
//public class ThrowDemo {
//
//	public static void main(String[] args) throws Exception {
//		
//		throw new ArithmeticException();
//		ArithmeticException e=new ArithmeticException();
//		throw e;
//	    ArithmeticException e=null;
//	    throw e;
//		
//		Exception e=new ArithmeticException();
//		throw e;
//		
//		
//		Exception e=new Exception();
//		e=new ArithmeticException();
//		throw e;
//		
//		int num1,num2;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter numbers");
//		num1=sc.nextInt();
//		num2=sc.nextInt();
//		try {
//		if(num2==0)
//		{
//			
//			throw new ArithmeticException("can not divide by zero");
//		}
//		else {
//			System.out.println("Division is"+(num1/num2));
//		}
//		}catch (ArithmeticException e) {
//			System.out.println(e);
//		}
//		
//		System.out.println("Addition is"+(num1+num2));
//		
//		
//	}
//}
