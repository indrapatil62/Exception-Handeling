package exceptionhandeling;

import java.io.FileNotFoundException;

abstract class AbsParent{
	abstract void show() throws FileNotFoundException;
}

class AbsChild extends AbsParent{

	@Override
	void show() throws FileNotFoundException {
		
		
	}
	
}
public class AbstractException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
