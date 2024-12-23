/******************************************************************************

Search Single Element in a sorted array

Problem Statement: Given an array of N integers. Every number in the array except one appears twice. Find the single number in the array.

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

		searchSingleElement(arr);
	}

	public static void searchSingleElement(int[] nums) {
		int l = 1, r = nums.length - 2, mid = 0, n = nums.length;
		if (n == 1)
			System.out.println("single number: " + nums[0]);
		if (nums[0] != nums[1])
			System.out.println("single number: " + nums[0]);
		if (nums[n - 1] != nums[n - 2])
			System.out.println("single number: " + nums[n-1]);
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
				System.out.println("single number: " + nums[mid]);
				break;
			} else if (mid % 2 == 1 && nums[mid] == nums[mid - 1]
			           || mid % 2 == 0 && nums[mid] == nums[mid + 1]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
	}
}
