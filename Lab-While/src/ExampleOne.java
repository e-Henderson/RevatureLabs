
public class ExampleOne {
	public static void main(String[] args) {
		boolean on =true;
		
		while(on) {
			System.out.println("Inside the while loop.");
			on=false;
			//if the above was not present, it would create those
			//lovely infinite loops.
		}
	}
}
