
public class ReturnTypes {
	public static void main(String[] args) {
		//instance
		ReturnTypes rt =new ReturnTypes();
		
		//call method
		rt.returnNothing();
		
		//like before with the cast variables
		boolean b = rt.returnBoolean();
		System.out.println("The value of b is: "+ b);
	}
	
	//method
	public void returnNothing() {
		System.out.println("inside void method.");
	}
	public boolean returnBoolean() {
		return true;//completes the boolean method
	}
}
