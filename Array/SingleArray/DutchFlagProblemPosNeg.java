package SingleArray;

/*Arrange Negative Numbers in Left end
 * And Followed by 0's and 
 * Positive numbers in extreme Other End
 * in One Scan O(n) time. 
 */
public class DutchFlagProblemPosNeg {

	public static void main(String[] args) {
		int arr[] = MemberClass.genertateRandomPosNegArray(10);
		arr[2] = 0;
		MemberClass.printArray(arr);
		doDutchFlagSetting(arr);
		MemberClass.printArray(arr);

	}

	private static void doDutchFlagSetting(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		int temp = 0;
		while (mid <= high) {
			int cases = (arr[mid] < 0) ? 0 : 2;
			cases = (arr[mid] == 0) ? 1 : cases;
			switch (cases) {
			case 0: {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
				break;
			}

			}

		}

	}

}
