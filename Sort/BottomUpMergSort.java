package sort;

public class BottomUpMergSort {

	public static void main(String[] args) {
		 int[] arr = MemberClass.genertateRandomArray(8);
		 MemberClass.printArray(arr);
		 doMergeSortNonRecursive(arr);

	}

	private static void doMergeSortNonRecursive(int[] arr) {
		int totalLen = arr.length;
		for(int stepSize = 1;stepSize<totalLen;stepSize = stepSize+stepSize) {
			for(int locStart=0;locStart< totalLen-stepSize;locStart +=stepSize+stepSize) {				
				doMerge(arr,locStart,locStart+stepSize,Math.min(locStart+stepSize+stepSize-1, totalLen-1));
			}
			
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
		MemberClass.printArray(arr);
		return arr;
	}

}
