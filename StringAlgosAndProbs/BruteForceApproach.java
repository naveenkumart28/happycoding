package StringMatchingAlgos;

public class BruteForceApproach {

	public  void main(String[] args) {
		String a = "aabc";
		String b = "dsaabcs";
		boolean s = patternMatching(a.toCharArray(),b.toCharArray());
		System.out.println("Pattern Matches is   " +s);

	}

	private  boolean patternMatching(char[] charArray, char[] charArray2) {
		int i = charArray.length;
		int j = charArray2.length;
		for(int k=0;k<=j-i;k++) {
			int l=0;
			while(l<i && charArray[l] == charArray2[k+l]) {
				l++;
			}
			if(l == i) return true;
			
		}
		return false;
	}

}
