
public class BinarySearchOfNumber {

	public static void main(String[] args) {
		BinarySearchOfNumber bSearch = new BinarySearchOfNumber();
		   final int arr1[] = {1, 2, 4, 5, 7, 8};
	        System.out.println(bSearch.search(arr1, -1));
	        System.out.println(bSearch.search(arr1, 1));
	        System.out.println(bSearch.search(arr1, 8));
	        System.out.println(bSearch.search(arr1, 2));
	    
	}

	private int search(int[] arr, int i) {
		int low = 0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = low +((high - low)/2);
			if (arr[mid] == i) {
				return mid;
			} else if(arr[mid] > i) {
				high = mid-1;
			} else {
				low = mid+1;
			}
			
			
		}
		return -1;
	}
	
}


