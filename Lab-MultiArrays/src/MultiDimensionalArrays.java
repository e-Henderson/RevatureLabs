
public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int[][][] my3dArray = new int[3][3][3];
		
		my3dArray[0][0][0]=1;
		System.out.println(my3dArray[0][0][0]);
		
		int[][] my2dArray =
				
			//	0    	1		2  access for first set of []
			//0 1 2	  0 1 2   0 1 2 access for second set of[ 
			{{1,2,0},{4,5,6},{1,4,5}};
		System.out.println(my2dArray.length);
		
		System.out.println(my2dArray[2][1]);
	}
}
