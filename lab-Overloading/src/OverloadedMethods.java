
public class OverloadedMethods {
	public static void main(String[] args) {
		//instance
		OverloadedMethods om =new OverloadedMethods();
		om.print();//first method
		
		om.print("second print method.");//second method
		
		om.print("This is the ", "third print method.");//third method
	}
	//overloaded methods
	public void print() {
		System.out.println("original print method.");
	}
	public void print(String str) {
		System.out.println(str);
	}
	public void print(String str, String str2) {
		System.out.println(str + str2);
	}
}
