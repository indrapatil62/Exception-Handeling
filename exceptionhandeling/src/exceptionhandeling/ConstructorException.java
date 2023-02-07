package exceptionhandeling;

public class ConstructorException {
	public ConstructorException() {
		try {                      
			System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		ConstructorException c=new ConstructorException();
		
	}

}
