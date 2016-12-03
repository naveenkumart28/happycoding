package SingleArray;

import java.util.Arrays;

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
