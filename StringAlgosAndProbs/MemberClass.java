package StringMatchingAlgos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class MemberClass {

	public static String generateString(int length) {
		char[] ch = new char[length];
			IntStream is =new Random().ints(length, 65, 91);
			Iterator its = is.iterator();
			int i=0;
			while(its.hasNext()) {
				int j = (Integer) its.next();
				ch[i] = (char) j;
				i++;
				
			}
			String a =new String(ch);
		System.out.println(a);
		return a;
	}

}
