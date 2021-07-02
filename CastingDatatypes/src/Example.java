
public class Example {
	public static void main(String[] args) {
		//casts int to short
		int i =200;
		short s = (short) i;
		System.out.println(s);
		//casts int to double
		double d = (double)i;
		System.out.println(d);
		//cast int to byte
		byte b = (byte)i;
		System.out.println(b);
		/*
		 * b will actually be printed as -56. why?
		 * becasue byte is an 8-bit type. i has been
		 * downcasted and has lost data. in fact its an 
		 * entirely diff num. 
		 */
	}
}
