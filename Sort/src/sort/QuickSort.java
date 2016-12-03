package sort;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		 int[] arr = MemberClass.genertateRandomArray(8);
		 MemberClass.printArray(arr);
		 doQuickSort(arr,0,arr.length-1);
		 MemberClass.printArray(arr);

	}

	private static void doQuickSort(int[] arr,int lowIndex,int highIndex) {
		if(lowIndex < highIndex) {
			int pivot = (new Random().nextInt(highIndex-lowIndex))+lowIndex;
			int pos = doSortReurnPivot(arr,lowIndex,highIndex,pivot);
			doQuickSort(arr,lowIndex,pos);
			doQuickSort(arr,pos+1,highIndex);
			
		}
		
	}

	private static int doSortReurnPivot(int[] arr, int lowIndex, int highIndex, int pivot) {
		int leftStart = lowIndex;
		MemberClass.swapArray(arr, leftStart, pivot);
		while(lowIndex < highIndex) {
		while(arr[lowIndex] < arr[leftStart]) {
			lowIndex++;
		} while (arr[highIndex] > arr[leftStart]) {
			highIndex--;
		} if (lowIndex < highIndex) {
			MemberClass.swapArray(arr, lowIndex, highIndex);
		}
		}
		MemberClass.swapArray(arr, leftStart, highIndex);		
		
		return highIndex;
	}
}
