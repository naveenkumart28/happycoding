package SingleArray;

import java.util.Arrays;

public class EqualOrMiddlePoint {
	/*
	 * Solution For GOG Prob Given a sorted array of n size, the task is to find
	 * whether an element exists in the array from where number of smaller
	 * elements is equal to number of greater elements.
	 * 
	 * Input : arr[] = {1, 2, 3, 3, 3, 3} Output : 1 Equal Point is arr[1] which
	 * is 2. Number of elements smaller than 2 and greater than 2 are same.
	 * 
	 * Input : arr[] = {1, 2, 3, 3, 3, 3, 4, 4} Output : Equal Point does not
	 * exist.
	 * 
	 * Input : arr[] = {1, 2, 3, 4, 4, 5, 6, 6, 6, 7} Output : 3 First
	 * occurrence of equal point is arr[3]
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 5, 6, 6, 6, 7 };
		int index = findEqualPoint(arr);
		System.out.println("Index is        " + index);

	}

	private static int findEqualPoint(int[] arr) {
		int arr1[] = new int[arr.length];
		int insVal = arr[0];
		int i = 0;
		arr1[i] = insVal;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] == insVal)
				continue;
			else {
				arr1[++i] = arr[j];
				insVal = arr[j];
			}
		}
		int[] arr2 = Arrays.copyOfRange(arr1, 0, i + 1);
		if (arr2.length % 2 == 0)
			return -1;
		else {
			int k = arr2[arr2.length / 2];
			for (int m = 0; m < arr.length; m++) {
				if (arr[m] == k) {
					return m;
				}
			}

		}
		return -1;

	}

}
