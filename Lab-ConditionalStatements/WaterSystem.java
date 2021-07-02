
public class WaterSystem {
	public static void main(String[] args) {
		int precipitation=0;
		int waterOutput=0;//this has just been initialized
		int temperature =80;
		
		if (precipitation <20) {
			if(temperature <=75) {
				waterOutput=30;//you can keep redefining the variable	
			}
			else {
				waterOutput=45;
			}
			
		}else if(precipitation <31) {
			if(temperature <=75) {
				waterOutput=10;
			}
			else {
				waterOutput=25;
			}
			
		}else if(precipitation <56) {
			if (temperature <=75) {
				waterOutput=0;
			}
			else {
				waterOutput=15;
			}
		}else {
			waterOutput=0;
		}
		
		System.out.println("Water output should be " + waterOutput);
	}
}
