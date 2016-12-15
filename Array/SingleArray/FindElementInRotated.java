package SingleArray;

import java.util.Arrays;

public class FindElementInRotated {

	public static void main(String[] args) {
		int[] arr = MemberClass.genertateRandomArray(10);
		Arrays.sort(arr);
		MemberClass.printArray(arr);
		int rot = 3;
		for (int i = 0; i < rot; i++)
			RotateLeft(arr);
		MemberClass.printArray(arr);
		int ele = arr[8];
		int i = findElementRecurse(arr, 0, arr.length - 1, ele);
		System.out.println("Elemeny is at   " + i);
		int j = findElementNonRecurse(arr, 0, arr.length - 1, ele);
		System.out.println("Elemeny is at   " + j);
	}

	private static int findElementNonRecurse(int[] arr, int low, int high, int ele) {

		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (arr[mid] == ele) {
				return mid;
			} else if (arr[mid] > arr[low]) {
				if (arr[low] <= ele && arr[mid] >= ele) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}

			} else {
				if (arr[high] >= ele && arr[mid] <= ele) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			}
		}
		return 0;
	}

	private static void RotateLeft(int[] arr) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;

	}
	/*
	 * Method 1, find the Pivot where the sequence changes it takes O(logn) Find
	 * the Range of Element from 0 to Pivot and Pivot to ArrayLength it takes
	 * O(logn), time complexity O(log n) with two scans
	 */

	/* Method 2 With Single Scan with Recursion */
	public static int findElementRecurse(int arr[], int left, int right, int ele) {
		if (left >= right)
			return -1;
		int mid = left + (right - left) / 2;
		if (arr[mid] == ele) {
			return mid;
		} else if (arr[left] < arr[mid]) { // Array is Sorted from Left to Mid
			if (arr[left] <= ele && arr[mid] >= ele) {
				return findElementRecurse(arr, left, mid, ele);
			} else {
				return findElementRecurse(arr, mid + 1, right, ele);
			}

		} else { // Array is sorted from Mid to Right
			if (arr[right] >= ele && arr[mid] <= ele) {
				return findElementRecurse(arr, mid + 1, right, ele);
			} else {
				return findElementRecurse(arr, left, mid, ele);
			}
		}

	}

	/*
	 * Method 3, Without using recursive Function
	 * 
	 */

}
