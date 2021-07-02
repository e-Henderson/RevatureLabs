
public class ProductPrinter {
	public static void main(String[] args) {
		int [] arr1 = {2,4,6,8,10,12,14,16,18,20};
		int[] arr2 = {1,2,3,5,7,9,11,13,17,19};
		
		/*
		 * note the next bit is similar to how we read arrays
		 * in 381.
		 */
		
		for (int i=0; i<arr1.length;i++) {//reads arr1
			/*
			 * note: I don't know why this took this long to click
			 * but the index starts at 0 so initializing i or j
			 * to 0, means the index will start exactly at 0 and go
			 * to the last size in the array 
			 */
			for (int j=0; j<arr2.length;j++) {//reads arr2
				System.out.println(arr1[i]*arr2[j]);//prints products of both
				
			}
		}
	}
}
