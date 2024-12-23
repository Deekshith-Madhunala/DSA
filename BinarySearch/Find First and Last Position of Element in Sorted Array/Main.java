/******************************************************************************

Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

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

		firstAndLastPositions(arr, n, target);
	}

	public static void firstAndLastPositions(int[] arr, int n, int x) {
		int l =0, r= n-1;
		int start  = -1, end = -1;
		int[] ans = {-1, -1};

		ans[0] = findStartPosition(arr, x);
		ans[1] = findEndPosition(arr, x);
		System.out.println("start: = " + ans[0]);
		System.out.println("End: = " + ans[1]);
	}
	public static int findStartPosition(int[] arr, int x) {
		int l=0, r=arr.length-1, start =-1;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(arr[mid] == x) {
				start = mid;
				r = mid-1;
			} else if(arr[mid]<x) {
				l= mid+1;
			} else {
				r= mid -1;
			}
		}
		return start;
	}

	public static int findEndPosition(int[] arr, int x) {
		int l=0, r=arr.length-1, end =-1;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(arr[mid] == x) {
				end = mid;
				l = mid+1;
			} else if(arr[mid]<x) {
				l= mid+1;
			} else {
				r= mid -1;
			}
		}
		return end;
	}
}
