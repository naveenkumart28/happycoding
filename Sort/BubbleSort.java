package sort;

public class BubbleSort {

	public static void main(String[] args) {
		 int[] arr = MemberClass.genertateRandomArray(8);
		 MemberClass.printArray(arr);
		 doBubbleSort(arr);
		 System.out.println();
	}

	private static void doBubbleSort(int[] arr) {
		for(int i =0; i < arr.length;i++) {
			for(int j =0; j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1])
					arr = MemberClass.swapArray(arr, j, j+1);				
			}				
		}
		MemberClass.printArray(arr);
	}

}
