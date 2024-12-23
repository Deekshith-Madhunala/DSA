/******************************************************************************

Floor and Ceil in Sorted Array

Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
The floor of x is the largest element in the array which is smaller than or equal to x.
The ceiling of x is the smallest element in the array greater than or equal to x.

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

		floorAndCeil(arr, n, target);
	}

	public static void floorAndCeil(int[] a, int n, int x) {
		int l =0, r= n-1;
		int floor = Integer.MIN_VALUE, ceil = Integer.MAX_VALUE;
		int[] ans = {-1, -1};
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(a[mid] == x) {
				ans[0] =  a[mid];
				ans[1] =  a[mid];
			}
			if(a[mid]<= x) {
				floor = Math.max(floor, a[mid]);
				ans[0] = floor;
				l = mid +1;
			}
			if(a[mid]>= x) {
				ceil = Math.min(ceil, a[mid]);
				ans[1] = ceil;
				r = mid -1;
			}
		}
		System.out.print("floor: = " + ans[0]);
		System.out.print("Ceil: = " + ans[1]);
// 		return ans;
	}
}
