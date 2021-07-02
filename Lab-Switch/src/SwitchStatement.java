
public class SwitchStatement {
	public static void main(String[] args) {
		int x =5;
		
		switch(x) {
		case 6: System.out.println("case 6 ran.");
		break;
		default: System.out.println("Default case ran.");
		break;
		case 7: System.out.println("case 7 ran.");
		break;
		case 10: System.out.println("case 10 ran.");
		/*
		 * the last case doesn't need a break statement because its the 
		 * last one.
		 */
		}
	}
}
