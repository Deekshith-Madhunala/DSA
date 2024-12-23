/******************************************************************************

Reverse a given Array

Problem Statement: You are given an array. The task is to reverse the array and print it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr  = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i =0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

        // Iterative approach
		for(int i=0,j=n-1; i<=j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int i =0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
