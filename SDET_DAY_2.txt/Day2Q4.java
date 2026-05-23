package April_Batch;

public class Day2Q4 {
	
	static int marks = 55;
	public static void main(String[]args) {
		
		if(marks>= 90) {
			System.out.println("Grade A+");
		}
		else if(marks>= 80 && marks<90) {
			System.out.println("Grade A");
		}
		else if(marks>= 70 && marks<80) {
			System.out.println("Grade B");
		}
		else if(marks<= 60 && marks<70) {
			System.out.println("Grade C");
		}
		else if(marks<= 50) {
			System.out.println("Grade D");
		}
	}
	

}
