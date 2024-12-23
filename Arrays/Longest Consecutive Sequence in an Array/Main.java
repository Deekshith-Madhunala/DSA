/******************************************************************************

Longest Consecutive Sequence in an Array

Problem Statement: You are given an array of b Nb  integers.
You need to find the length of the longest sequence which contains the consecutive elements.
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

		consecutiveSequence(arr, n);
	}

	public static void consecutiveSequence(int[] a, int n) {
		HashSet<Integer> hash_set = new HashSet<>();
		int maxSeq = 0;

		for(int i=0; i<n; i++) {
			hash_set.add(a[i]);
		}
		for(int i=0; i<n; i++) {
			if(!hash_set.contains(a[i]-1)) {
				int currentNum = a[i];
				int count = 1;
				while(hash_set.contains(currentNum+1)) {
					count++;
					currentNum++;
				}
				maxSeq = Math.max(maxSeq, count);
			}
		}
		System.out.print("longest sequence length = "+ maxSeq);
	}
}