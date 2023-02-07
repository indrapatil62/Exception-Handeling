package exceptionhandeling;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
	    int num[]= {1,2,3,4,5};
		try {
			   System.out.println("Outer try block");
			   System.out.println(num[2]);
			 try {
				    System.out.println(num[1]/0);
				 System.out.println("Inner try block");
			 }
			 catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}			
	}

}

