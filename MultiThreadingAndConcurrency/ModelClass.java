import java.util.ArrayList;

public class ModelClass {

	/*public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder("A");
		sb.append("B");
		System.out.println(sb);
		callMethod(sb);
		sb.append("E");
		System.out.println(sb);
		final ArrayList<Integer> arr = new ArrayList<>(6);
		arr.add(0, 1);
		arr.add(1, 3);
		arr.add(2, 2);
		System.out.println(arr);
		callMethod(arr);
		System.out.println(arr);
		final String s = "Naveen";
		callMethod(s);
		System.out.println(s);
		final int j = 5;
		callmethod(j);
		System.out.println(j);
	}*/
	
	public static void main(String args[]) {
		try {
			try {
				System.out.println("going to divide");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			} finally {
				System.out.println("Return");
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			} finally {
				System.out.println("ReturnSecond");
			}

			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}finally {
			System.out.println("Return last");
		}


		System.out.println("normal flow..");
	}

	private static void callmethod(int j) {
		j = 10;
		
	}

	private static void callMethod(String s) {
		s = "Kumar";
		
	}

	private static void callMethod(StringBuilder sb) {
		//sb = new StringBuilder("C");
		sb.append("D");
		System.out.println(sb);
		
	}
	




private static void callMethod(ArrayList<Integer> arr) {
	arr.add(3, 4);
	arr.add(4, 5);
	arr.add(5, 6);
	
}


}
