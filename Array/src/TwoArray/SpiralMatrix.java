package TwoArray;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr = MemberClass.genertateRandomArray(2,2);
		MemberClass.printArray(arr);
		printSpiralMatrix(arr);
	}

	private static void printSpiralMatrix(int[][] arr) {
		int rVal = arr.length-1;
		int cVal = arr[0].length-1;
		int rcount = 0;
		int ccount = 0;
		while(rcount < Math.sqrt(rVal) && ccount < Math.sqrt(cVal)) {
			int temRowVal = rcount;
			int temColVal = ccount;
			while(temColVal < cVal-ccount && temRowVal == rcount) {
				System.out.print(arr[temRowVal][temColVal] + "  ");
				temColVal++;
			}
			System.out.print(arr[temRowVal][temColVal] + "  ");
			temRowVal++;
			while(temRowVal < rVal-rcount && temColVal== cVal - ccount ) {
				System.out.print(arr[temRowVal][cVal-ccount] + "  ");
				temRowVal++;
			} 
			System.out.print(arr[temRowVal][cVal-ccount] + "  ");
			temColVal --;
			while(temRowVal == rVal-rcount && temColVal > ccount  ) {
				System.out.print(arr[temRowVal][temColVal] + "  ");
				temColVal--;
			} 
			System.out.print(arr[temRowVal][temColVal] + "  ");
			temRowVal--;
	        while(temRowVal > rcount && temColVal == ccount) {
	        	System.out.print(arr[temRowVal][temColVal] + "  ");
				temRowVal--;	        	
	        }
	        rcount++;
	        ccount++;      
		}
	}
}
		
		
	

