package exceptionhandeling;

public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("eXECEPTION HANDELED");
			int a=30/0;
		}
		catch(ArithmeticException e){
			int B=30/0;
		}
		System.out.println("eXECEPTION HANDELED");
	}

}
