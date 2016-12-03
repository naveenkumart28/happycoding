package SingleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*An array contains Either single Digit Or two Digit Number
 * Form Greatest Number Using it * 
 * If arr->[1,2,3,32,8,89,5]
 * Greatest Number is 89853221
 */
public class FormBiggestNumber {

	public static void main(String[] args) {
		int arr[] = MemberClass.genertateRandomArray(4);
		MemberClass.printArray(arr);
		ArrayList<String> stringarr = new ArrayList<>();
		for (int i : arr) {
			stringarr.add(String.valueOf(i));
		}
		Collections.sort(stringarr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2).compareTo(s1);
			}
		});
		String s = "";
		for (String i : stringarr) {
			s = s + i;
		}
		System.out.println(s);

	}

}
