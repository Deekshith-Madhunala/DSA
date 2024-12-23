/******************************************************************************

Minimum days to make M bouquets

Problem Statement: You are given 'Nb  roses and you are also given an array 'arr'  where 'arr[i]'  denotes that the 'ith' rose will bloom on the 'arr[i]th' day.
You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet.
Find the minimum number of days required to make at least b m' bouquets each containing 'k' roses. Return -1 if it is not possible.

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

		int m = sc.nextInt();
		int k = sc.nextInt();
		System.out.print("Minimum days = " +minimumdays(arr, m, k));
	}

	public static int minimumdays(int[] bloomDay, int m, int k) {
		long val = (long) m * k;
		int n = bloomDay.length;
		if (val > n) return -1;

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < bloomDay.length; i++) {
			max = Math.max(max, bloomDay[i]);
			min = Math.min(min, bloomDay[i]);
		}
		int lt = min, rt =max;
		while(lt<=rt) {
			int mid = lt+ (rt-lt)/2;
			if(bloomPossible(bloomDay, mid, k, m)) {
				rt = mid -1;
			} else {
				lt = mid +1;
			}
		}
		return lt;
	}

	public static boolean bloomPossible(int[] arr, int mid, int k, int m) {
		int count = 0, bokays = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= mid) {
				count++;

			} else {
				bokays += count / k;
				count = 0;
			}
		}
		bokays += count / k;
		return bokays>=m;
	}


}