
/*This removes the Duplicates of Elements In an Array
Time Complexity : O(n)
Space Complexity : O(n)
*/
package SingleArray;

import java.util.Arrays;

public class DuplicatesRemoval {

	public static void main(String[] args) {
		int[] arr = {1,9,4,4,2,2,7,9};
		arr = removeDuplicates(arr);
        MemberClass.printArray(arr);
	}

	private static int[] removeDuplicates(int[] arr) {
		int longestLength = arr.length;
		for(int i=0; i< arr.length;i++) {
			for (int j=i+1;j< arr.length;j++) {
				if(arr[i] == arr[j] && arr[j] != -1) {
					longestLength--;
					while(j < arr.length) {
						if(j == arr.length-1) arr[j]= -1;
						else arr[j] = arr[j+1];
						j++;						
					}	
					MemberClass.printArray(arr);
					System.out.println(longestLength);
					
				}				
			}			
		}
		int[] arr1 = Arrays.copyOfRange(arr, 0, longestLength);
		return arr1;
	}

}

