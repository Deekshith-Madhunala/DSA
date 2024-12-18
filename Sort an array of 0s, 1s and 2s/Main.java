/******************************************************************************

Sort an array of 0s, 1s and 2s

Problem Statement: Given an array consisting of only 0s, 1s, and 2s.
Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] nums = new int[n];

		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}

		sortZerosOnesAndTwos(nums, n);
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+" ");
		}
	}

	public static void sortZerosOnesAndTwos(int[] nums, int n) {
		int l=0, m=0, h=n-1, temp;

		while(m<=h) {
			if(nums[m]==0) {
				temp = nums[l];
				nums[l]= nums[m];
				nums[m]= temp;
				l++;
				m++;
			} else if(nums[m]==1) {
				m++;
			} else {
				temp = nums[m];
				nums[m]= nums[h];
				nums[h]= temp;
				h--;
			}
		}
	}
}