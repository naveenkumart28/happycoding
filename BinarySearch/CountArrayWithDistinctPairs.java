
public class CountArrayWithDistinctPairs {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,7,9};
		System.out.println(count(arr,3));

	}

	private static int count(int[] arr, int k) {
		int count =0;
		for(int i =0; i< arr.length; i++) {
			boolean binarrSearch = matchConstant(arr,i,arr.length-1,arr[i]+k);
			if(binarrSearch) count++;
		}
		return count;
	}

	private static boolean matchConstant(int[] arr, int low, int high, int k) {
		if(low > high) 
		return false;
		int mid = (low + (high-low)/2);
		if(arr[mid] == k) return true;
		else if(arr[mid] > k) return matchConstant(arr, low, mid-1, k);
		else return matchConstant(arr, mid+1, high, k);
		
	}

}
