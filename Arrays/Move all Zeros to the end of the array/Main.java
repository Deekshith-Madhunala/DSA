/******************************************************************************

Move all Zeros to the end of the array

In this article we will learn how to solve the most asked coding interview problem: "Move all Zeros to the end of the array"

Problem Statement: You are given an array of integers,
your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}

		moveZerosToEnd(arr, n);
	}

	public static void moveZerosToEnd(int[] nums, int n) {

		int j = -1;

		if (n == 1) {
			System.out.print(nums[0]);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				j = i;
				break;
			}
		}

		if (j == -1) {
			for (int i = 0; i < n; i++) {
				System.out.print(nums[i]);
			}
			return;
		}

		for (int i = j + 1; i < n; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(nums[i]);
		}
	}
}
