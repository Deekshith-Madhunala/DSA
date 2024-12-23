/******************************************************************************

Kadane's Algorithm : Maximum Subarray Sum in an Array

Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr  = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		findMaxSumInSubArrayAndPrint(arr, n);
	}

	public static void findMaxSumInSubArrayAndPrint(int[] nums, int n) {

		long maxi = Long.MIN_VALUE;
		long sum = 0;

		int l=-1, r=-1, start=0;

		for (int i = 0; i < n; i++) {

			if(sum==0) {
				start=i;
			}
			sum += nums[i];

			if (sum > maxi) {
				maxi = sum;
				l=start;
				r = i;
			}
			if (sum < 0) {
				sum = 0;
			}
		}

		for(int i=l; i<=r; i++) {
			System.out.println(nums[i]+ " ");
		}
		System.out.print("maxSum = "+ maxi);
	}
}
