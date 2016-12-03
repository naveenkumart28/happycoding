package sort;

import java.util.List;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = MemberClass.genertateRandomArray(8);
		 MemberClass.printArray(arr);
		 doSelectionSort(arr);
		 MemberClass.printArray(arr);

	     
	}

	private static int[] doSelectionSort(int[] arr) {
		for(int i =0; i < arr.length;i++) {
			int temp = i;
			for(int j =i+1; j<arr.length;j++) {
				if(arr[j] < arr[temp])
					temp = j;								
			}	
			MemberClass.swapArray(arr, i, temp);
		}
		return arr;
		
	}

}
