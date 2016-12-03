package StringMatchingAlgos;

import java.util.Map.Entry;
import java.util.TreeMap;

public class StringPermutations {

	public static void main(String[] args) {
		String s = MemberClass.generateString(5);
		TreeMap<Character, Integer> countMap = new TreeMap();
		char[] ch = s.toCharArray();
		for (Character cha : ch) {
			int val = 0;
			val = (countMap.containsKey(cha)) ? countMap.get(cha) : val;
			countMap.put(cha, val + 1);
		}
		char charArr[] = new char[countMap.size()];
		int intArr[] = new int[countMap.size()];
		int val = 0;
		for (Entry<Character, Integer> e : countMap.entrySet()) {
			char c = e.getKey();
			int i = e.getValue();
			charArr[val] = c;
			intArr[val] = i;
			val++;

		}
		char[] result = new char[s.length()];
		int level = 0;
		calculatePermUtil(charArr, intArr, result, level);

	}

	private static void calculatePermUtil(char[] charArr, int[] intArr, char[] result, int level) {
		if (result.length == level) {
			System.out.println(new String(result));
			return;
		}
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == 0) {
				continue;
			}
			result[level] = charArr[i];
			intArr[i]--;
			calculatePermUtil(charArr, intArr, result, level + 1);
			intArr[i]++;
		}

	}

}
