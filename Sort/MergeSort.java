package sort;

public class MergeSort {

	public static void main(String[] args) {
		 int[] arr = MemberClass.genertateRandomArray(8);
		 MemberClass.printArray(arr);
		 doMergeSortRecursive(arr,0,arr.length-1);
		 MemberClass.printArray(arr);

	}

	private static void doMergeSortRecursive(int[] arr,int lowIndex,int highIndex) {
		if(lowIndex < highIndex) {
		int midIndex = (highIndex+lowIndex)/2;
		doMergeSortRecursive(arr,lowIndex,midIndex);
		doMergeSortRecursive(arr,midIndex+1,highIndex);
		arr = doMerge(arr,lowIndex,midIndex+1,highIndex);
		
		}
	}

	private static int[] doMerge(int[] arr, int lowIndex, int midIndex, int highIndex) {
		int leftStart = lowIndex;
		int leftEnd = midIndex-1;
		int tempIndex = 0;
		int[] tempPos =new int[highIndex-lowIndex+1];
		while(leftStart <= leftEnd && midIndex <= highIndex ) {
			if(arr[leftStart] <= arr[midIndex]) {
				tempPos[tempIndex] = arr[leftStart];
				tempIndex ++;
				leftStart++;				
			} else {
				tempPos[tempIndex] = arr[midIndex];
				tempIndex ++;
				midIndex++;
			}			
		} while(leftStart <= leftEnd) {
			tempPos[tempIndex] = arr[leftStart];
			tempIndex ++;
			leftStart++;			
		}  while(midIndex <= highIndex) {
			tempPos[tempIndex] = arr[midIndex];
			tempIndex ++;
			midIndex++;			
		}
		
		for(int i=0;i<tempPos.length;i++) {
			//int j = highIndex-lowIndex+1;
			arr[lowIndex+i] = tempPos[i];
			//j++;
		}
		
		return arr;
	}

}
