/*Longest Increasing Subsequence
 * 
 * 3,4,-1,0,6,2,3
 * 
 * Increasing Subsequence Length is 4, -1,0,2,3
 * Algorithm Used
 * Initially load all DA by 1.
 * Make i as a pointer moving Forward
 * J starts from 0 till it reaches 1
 * if j val is less than i val increment by 1, if it provides greater value in i
 * 
 * Time Complexity is o(n2)
 * Space Complexity is o(n)
 * 
 * https://www.youtube.com/watch?v=S9oUiVYEq7E&spfreload=5
 *  Time Complexity is o(nlogn)
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = MemberClass.genertateRandomArray(8);
		MemberClass.printArray(arr);
		int arr1[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i] =1;
		}
		int lis = findLongestIncreasingSubseq(arr,arr1);
		System.out.println("Longest Increasing Subsequence is   " +lis);
	}

	private static int findLongestIncreasingSubseq(int[] arr, int[] arr1) {
		int i=1;
		while(i<arr.length) {
			int j=0;
			while(j<=i) {
				if(arr[j] < arr[i] && arr1[j]+1 > arr1[i]) arr1[i]=1+arr1[j];
				j++;
			}
			i++;
		}
		int max = Integer.MIN_VALUE;
		for(int k : arr1) {
			max = (k > max) ? k:max;
		}
		return max;
	}

}
