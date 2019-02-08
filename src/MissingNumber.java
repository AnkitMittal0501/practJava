
public class MissingNumber {
	/*
	 * * Java Program to find missing numbers in an integer * array with
	 * duplicates. Array may contains more * than one duplicates. * * input: {1,
	 * 1, 2, 3, 5, 5, 7, 9, 9, 9}; * output: 4, 6, 8
	 */
	public static void main(String[] args) {
		// given input
		int[] input = { 4,7,9,11,13,16};
		// let's create another array with same length // by default all index
		// will contain zero // default value for int variable
		findMissingNumbers(input, input[0], input[input.length-1]);
		int[] arr1={7,5,6,1,4,2};
		System.out.println("Missing number from array arr1: "+missingNumber(arr1));
		int[] arr2={5,3,1,2};
		System.out.println("Missing number from array arr2: "+missingNumber(arr2));
	}
	public static int missingNumber(int[] arr)
	{
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i < arr.length; i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		return missingNumber;
	}

	static void findMissingNumbers(int[] a, int first, int last) {
        // before the array: numbers between first and a[0]-1
for (int i = first; i < a[0]; i++) {
    System.out.println(i);
}
        // inside the array: at index i, a number is missing if it is between a[i-1]+1 and a[i]-1
for (int i = 1; i < a.length; i++) {
    for (int j = 1+a[i-1]; j < a[i]; j++) {
        System.out.println(j);
    }
}
        // after the array: numbers between a[a.length-1] and last
for (int i = 1+a[a.length-1]; i <last; i++) {
    System.out.println(i);
}
int[] seq={1,2,4,5};
//add these number 1+2+4+5 =12
//1+2+3+4+5 15
//15-12 3
int sum=0;
for(int i=0;i<seq.length;i++)
{
	sum+=seq[i];
}
System.out.println("The sum is "+sum);
int sum1 =0;
for(int j=0;j<=5;j++)
{
	sum1+=j;
}
System.out.println(sum1);
int MissingNum=sum1-sum;
System.out.println(MissingNum);
}
	

}
