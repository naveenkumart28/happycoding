package SingleArray;

public class PolynomialFunction {

	public static void main(String args[]) {
		int[] arr = MemberClass.genertateRandomArray(4);
		MemberClass.printArray(arr);
		int ployNom = 2;
		int returnResult=0;
		int degree=0;
		returnResult=doRecursively(degree,arr,ployNom,returnResult,arr.length);
		System.out.println(returnResult);
	}

	private static int doRecursively(int degree,int[] arr, int ployNom, int returnResult,int len) {
		if(degree<len) {
			int temp=0;
		for(int i=0; i<=degree;i++) {
			temp=(int)Math.pow(ployNom, i);
		} returnResult = returnResult + temp*arr[degree];
		return doRecursively(degree+1,arr,ployNom,returnResult,len);
		} else {
			return returnResult;
		}
	}
}
