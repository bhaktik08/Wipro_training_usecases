package April_Batch;

public class Day2Q1 {
	static int price = 45000;
	public static void main(String[] args) {
		
		if(price >= 50000) {
			System.out.println("you get 30% off");
		}
		else if(price >= 30000) {
			System.out.println("you get 20% off");
		}
		else if(price >= 10000) {
			System.out.println("you get 10% off");
		}
		else {
			System.out.println("Sorry! you don't get discount");
		}
	}

}
