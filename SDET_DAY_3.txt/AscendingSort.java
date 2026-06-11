package Day3_Assignments;

public class ascendingSort {
	public static void main(String[] args) {
		int[] arr = {6,2,8,4,1};
		
		for(int i=0; i < arr.length - 1; i++) {
			for(int j = 0; j<arr.length - 1; j++) {
				
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Ascending order: ");
		for(int num : arr) {
			System.out.println(num + " ");
		}
	}

}
