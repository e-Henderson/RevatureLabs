
public class ConditionalBlocks {

	public static void main(String[] args) {
		//boolean b=false;
		boolean firstCondition=false;
		boolean secondCondition=true;
		
		if (firstCondition) {//note, the arguments are automatically taken
			//as true unless told other wise.
			
			//will contain the other variant cond-states
			System.out.println("inside the if-statement");
			if(secondCondition) {
				System.out.println("inside the nested if-statement.");
			}
		
		}else if(secondCondition) {
			System.out.println(5);
		}
		else {
			System.out.println("inside the else-statement.");
		}
		System.out.println("outside the if-statement");
		
		
	}

}
