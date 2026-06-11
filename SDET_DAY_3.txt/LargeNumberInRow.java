package Day3_Assignments;

public class largInEachRow {
	 public static void main(String[] args) {

	        int[][] arr = {
	            {3, 8, 2},
	            {5, 1, 9},
	            {4, 7, 6}
	        };

	        for (int i = 0; i < arr.length; i++) {

	            int max = arr[i][0]; 

	            for (int j = 1; j < arr[i].length; j++) {
	                if (arr[i][j] > max) {
	                    max = arr[i][j];
	                }
	            }

	            System.out.println("Largest in row " + i + " = " + max);
	        }
	    }
}
