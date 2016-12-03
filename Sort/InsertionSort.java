package sort;

public class InsertionSort {

	public static void main(String[] args) {
		 int[] arr = MemberClass.genertateRandomArray(8);
		 MemberClass.printArray(arr);
		 doInsertionSort(arr);

	}

	private static void doInsertionSort(int[] arr) {
		for(int i =1; i < arr.length;i++) {
			int temp = arr[i];
		    int j = i-1;
			while(j >= 0 && temp < arr[j]) {
				int tempval= arr[j];
				arr[j] =arr[j+1];
				arr[j+1] = tempval;
				j--;
			}
			
		}
		MemberClass.printArray(arr);
		
	}
}
