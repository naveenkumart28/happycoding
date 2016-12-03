
public class RecursiveFibonacci {

	public static void main(String[] args) {
		int i =9;
		int cal = calculateRecursiveFibonacci(i);
        System.out.println(cal);
	}

	private static int calculateRecursiveFibonacci(int i) {
		if(i < 2)
		return i;
		else return calculateRecursiveFibonacci(i-1) + calculateRecursiveFibonacci(i-2);
	}

}
