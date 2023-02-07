package exceptionhandeling;

import java.io.IOException;

class Parent12 extends Exception {
	
	public Parent12()
	{
		super("heyyy");
	}
	
}

class Child12
{
	void calculate() throws Parent12  
	{
		
		throw new Parent12();}
}

public class Hey {

	public static void main(String[] args) {
		Child12 p=new Child12();
		
			try {
				p.calculate();
			} catch (Parent12 e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
			
			System.out.println("HIIIIIII");
		

	}

}
