package SingleArray;
/*Given an array of unique elements rearrange the array to be a < b > c < d > e form
*
* Time complexity - O(n)
* Space complexity - O(1)
*/
public class ZigZagArrangement {

	public static void main(String[] args) {
		int[] arr = MemberClass.genertateRandomArray(5);
		MemberClass.printArray(arr);
		doZigZagArrangement(arr);
		MemberClass.printArray(arr);
	}

	private static void doZigZagArrangement(int[] arr) {
		boolean isLess = true;
		for(int i=0; i < arr.length-1;i++) {
			if(isLess) {
			if(arr[i] > arr[i+1]) {
				MemberClass.swapArray(arr, i, i+1);
			}
			} else {
				if(arr[i] < arr[i+1]) {
					MemberClass.swapArray(arr, i, i+1);
				}
			}
			isLess = !isLess;
			
		}
		
	}
}
