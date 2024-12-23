/******************************************************************************

Search Insert Position

Problem Statement: You are given a sorted array arr of distinct values and a target value x.
You need to search for the index of the target value in the array.

If the value is present in the array, then return its index. Otherwise, determine the index where it would be inserted in the array
while maintaining the sorted order.

*******************************************************************************/
import java.util.*;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int target = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(seachInserPosition(arr, target));
	}

	public static int seachInserPosition(int[] nums, int target) {
		int l=0, r=nums.length-1;
		int floor =0, ceil=0;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid]<target) {
				l= mid+1;
			}
			else {
				r= mid-1;
			}
		}
		return l;

	}
}
