/******************************************************************************

Search Element in a Rotated Sorted Array

Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value k.
Now the array is rotated at some pivot point unknown to you. Find the index at which k is present and if k is not present return -1.

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

		searchElement(arr, target);
	}

	public static void searchElement(int[] nums, int target) {
		int l=0, r= nums.length-1;

		while(l<=r) {
			int mid = l + (r-l)/2;
			if(nums[mid] == target) {
				// return mid;
				System.out.println("found element at : " + mid);
				break;
			}
			if(nums[l]<= nums[mid]) {
				if(nums[l] <= target && target< nums[mid]) {
					r= mid -1;
				} else {
					l = mid+1;
				}
			} else {
				if(nums[mid] <= target && target<= nums[r]) {
					l = mid+1;
				} else {
					r= mid-1;
				}
			}
		}
		System.out.println(" element not found : " + -1);
	}
}
