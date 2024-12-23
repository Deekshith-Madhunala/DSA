/******************************************************************************

Find Second Smallest and Second Largest Element in an array

Problem Statement: Given an array, find the second smallest and second largest element in the array.
Print b -1b  in the event that either of them doesnb t exist.

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

// 		approachWithTwoIterations(arr, n);
		approachWithSingleIteration(arr, n);
	}

	public static void approachWithTwoIterations(int[] arr, int n) {

		int maxElement = Integer.MIN_VALUE;
		int minElement = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			maxElement = Math.max(maxElement, arr[i]);
			minElement = Math.min(minElement, arr[i]);
		}

// 		second maxElement and minElement
		int secondMax = Integer.MIN_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for(int i=0; i<n; i++) {
			if(arr[i]!=maxElement && arr[i]<maxElement && arr[i]>secondMax) {
				secondMax = arr[i];
			}
			if(arr[i]!=minElement && arr[i]>minElement && arr[i]<secondMin) {
				secondMin = arr[i];
			}
		}
		System.out.println("secondMin = "+ secondMin + "\nsecondMax = "+ secondMax);
	}

	public static void approachWithSingleIteration(int[] arr, int n) {

		int largest = arr[0], second_largest = Integer.MIN_VALUE;
		int smallest = arr[0], second_smallest = Integer.MAX_VALUE;

		for(int i=1; i<n; i++) {
			if(arr[i] > largest) {
				second_largest = largest;
				largest = arr[i];
			} else if(arr[i] > second_largest && arr[i]!=largest) {
				second_largest = arr[i];
			}

			if(arr[i]< smallest) {
				second_smallest = smallest;
				smallest = arr[i];
			} else if(arr[i]< second_smallest && arr[i] != smallest) {
				second_smallest = arr[i];
			}
		}
		System.out.println("largest = "+ largest+ " \nsecond_largest = "+ second_largest +
		                   "\nsmallest = " + smallest + "\nsecond_smallest = " + second_smallest);
	}
}
