package Day3_Assignments;

public class DuplicateEle {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2,5,1};
		int n = arr.length;
		
		int[] temp = new int[n];
		int j = 0;
		
		for(int i = 0; i<n; i++) {
			int k;
			for(k = 0; k < j; k++) {
				if(arr[i] == temp[k]) {
					break;
				}
			}
			
			if(k == j) {
				temp[j++] = arr[i];
			}
		}
		
		for(int i=0; i<j; i++) {
			System.out.println(temp[i] + " ");
		}
	}
}
