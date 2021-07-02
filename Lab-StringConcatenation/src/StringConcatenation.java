
public class StringConcatenation {
	public static void main(String[] args) {
		String beginning = "Hello";
		String end = "World";
		String combo = beginning + end;
		System.out.println(combo);
		
		long l =203l;
		System.out.println("The value os l is: " + l);
		
		boolean b = true;
		System.out.println(b + " is true.");
		
		int x=2;
		int y=3;
		System.out.println("The sum of x and y is: "+ x+y);
		//notice that this line is NOT adding them. It's merely printing them
		//however if we use (x+y)
		System.out.println("Sum of x and y: " + (x+y));
		//also ths position doesn't matter
		System.out.println(x+y+" is the sum of x and y.");
		//this is becasue its read from left to right and since that is the case
		//math takes precedence. If its the other way around, concatenation takes precedence.
		
	}
}
