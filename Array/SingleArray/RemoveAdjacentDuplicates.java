package SingleArray;

import java.util.Arrays;
/*
Removing Adjacent Duplicates.
Given an array we should remove adjacent duplicates,
if  given array is { 1, 0, 6, 5, 8, 8, 8, 5, 6, 0 }, removing adjacent duplicates
will give resultant array as {1}.
In Simple Words, Form an Output Array With nil Adjacent duplicates.
*/
public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 6, 5, 8, 8, 8, 5, 6, 0 };
		int i = removeAdjacentDuplicates(arr);
		for (int j = 0; j <= i; j++) {
			System.out.print("  " + arr[j]);
		}

	}

	private static int removeAdjacentDuplicates(int[] arr) {
		int str = -1;
		int i = 0;
		while (i < arr.length) {
			if (str == -1 || arr[i] != arr[str]) {
				str++;
				arr[str] = arr[i];
				i++;
			} else if (arr[i] == arr[str]) {
				while (i < arr.length && arr[i] == arr[str]) {
					i++;
				}
				str--;
			}

		}
		return str;
	}

}
