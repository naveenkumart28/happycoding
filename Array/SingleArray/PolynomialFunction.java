package SingleArray;
/*
Given An array of Integers,Consists alues in the range of
MinInteger to MaxInteger. Generate the Ouptput of the Polynomial Function , recursively
Where the value of unknown x will be given and
the coefficients for each degree will be taken from Array.
Degree and Index Of Arrays are same.

For Example, if given array = [0,1,-2] and Polynomial is 2,
Output is 0*pow(2,0) + 1*pow(2,1) - 2*pow(2,2)
= 0+2-8 = -6
*/
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

