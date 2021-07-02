
public class DisplayingArrays {
	public static void main(String[] args) {
		int[] intArray = new int[3];//remember indexing starts @0
		intArray[0]=-5123;
		intArray[2]=32;
		
		System.out.println(intArray[0]);//note:
		/*
		 * the output with of an empty array is [I@626b2d4a
		 * which is similar to what I dealt with in Car Project
		 * This output is the actual memory address of the 
		 * array itself
		 */
		System.out.println(intArray[1]);
		/*
		 * you cannot access the index at 3 becasue it is out of bounds
		 * this is because the indexing starts at 0 and ends at 2.
		 * however the array contains 3 things, [0,1,2]
		 */
		
	}
}
