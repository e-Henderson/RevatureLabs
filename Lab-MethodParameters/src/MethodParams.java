
public class MethodParams {
	public static void main(String[] args) {
		//instance
		MethodParams mp = new MethodParams();
		
		//call method
		double d=mp.convertInttoDouble(5);//needs to be defined
		System.out.println(d);//so it can be printed
		
		System.out.println(mp.sum(5.6, 20, 9));
	}
	//create method
	public double convertInttoDouble(int a) {
		return (double)a;//is cast to double from int
	}
	public double sum(double n, int n2, int n3) {
		return n+n2+n3;
	}
}
