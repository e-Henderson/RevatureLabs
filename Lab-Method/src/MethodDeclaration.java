
public class MethodDeclaration {
	public static void main(String[] args) {
		//class instance
		MethodDeclaration md = new MethodDeclaration();
		
		
		//call method
		md.talk();
		/*
		 * once the method has been created, it is then instantiated
		 * or 'ClassName varName = new ClassName();'
		 * the method can then be called however many times that is
		 * necessary
		 */
	}
	
	//create method
	public void talk() {
		System.out.println("Inside of the talk method.");
	}
}
