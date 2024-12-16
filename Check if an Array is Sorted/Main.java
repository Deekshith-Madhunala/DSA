/******************************************************************************

Check if an Array is Sorted

Problem Statement: Given an array of size n,
write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
If the array is sorted then return True, Else return False.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<n-1; i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("False");
				break;
			}
		}
		System.out.println("True");

	}
}
