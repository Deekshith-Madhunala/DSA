/******************************************************************************

Minimum in Rotated Sorted Array

Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array.

*******************************************************************************/
import java.util.*;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		findMinElement(arr);
	}

	public static void findMinElement(int[] arr) {
		int minEle = Integer.MAX_VALUE;

		int l=0, r= arr.length-1, index=0;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(arr[mid]>=arr[l]) {
				// minEle = Math.min(arr[l], minEle);
				if(arr[l]<minEle) {
					minEle = arr[l];
					index = l;
				}
				l = mid+1;
			} else {
				// minEle = Math.min(arr[mid], minEle);
				if(arr[mid]<minEle) {
					minEle = arr[mid];
					index = mid;
				}
				r= mid-1;
			}
		}
		System.out.println("Min element: " + minEle);
		System.out.println("Min element index: " + index);
	}
}
