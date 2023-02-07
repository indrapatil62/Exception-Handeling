package exceptionhandeling;

class ABC{
	void abc(int a) {
		/*try {                      //handle 
			System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println(e);
		}*/
		System.out.println(10/0);// Unchecked exception 
		System.out.println("This is overridden method of Parent class");
	}
}
class PQR extends ABC{
	void abc(int a) {
		super.abc(a);
		System.out.println("This is overridden method of child class");
	}
}
public class OverriddenException {

	public static void main(String[] args) {
		PQR p=new PQR();
		p.abc(10);
	}
}
