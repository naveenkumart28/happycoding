package SingleArray;

public class MemberClass {
	
	public static int[] genertateRandomArray(int length) {
		int[] arr = new int[length];
		for(int i =0; i <arr.length;i++) {
			arr[i] = (int)(Math.random()*50+1);
		}
		return arr;	
		
	}
	
	public static int[] genertateRandomPosNegArray(int length) {
		int[] arr = new int[length];
		for(int i =0; i <arr.length;i++) {
			int m = (int)(Math.random()*50);
			if(m%2 == 0) 
			arr[i] = (int)(Math.random()*50-100);
			else arr[i] = (int)(Math.random()*50+1);
		}
		return arr;	
		
	}
	
	public static int[] swapArray(int[] arr,int index1,int index2) {
		int temp = arr[index2];
		arr[index2] = arr[index1];
		arr[index1] = temp;		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i : arr) 
			System.out.print(i + " ");
		System.out.println(" ");
		
	}

}

