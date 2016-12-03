package TwoArray;

public class MemberClass {
	
	public static int[][] genertateRandomArray(int rowlength,int collength) {
		int[][] arr = new int[rowlength][collength];
		for(int i =0; i <rowlength;i++) {
			for(int j =0; j <collength;j++) {
			arr[i][j] = (int)(Math.random()*100+1);
			}
		}
		return arr;	
		
	}
	
	
	public static void printArray(int[][] arr) {
		for(int[] i : arr) {
			for(int j : i) {
			System.out.print(j + " ");
			}
		System.out.println(" ");
		}
		
	}

}
