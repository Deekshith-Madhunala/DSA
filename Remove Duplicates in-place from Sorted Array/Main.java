/******************************************************************************

Remove Duplicates in-place from Sorted Array

Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element
appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result.
It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

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

		int[] unique_array = new int[n];
		int j=0;
		for(int i=0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				unique_array[j] = arr[i];
				j++;
			}
		}
		
        System.out.println("k unique elements = " + (j+1));
        System.out.println();
        
		for(int i=0; i<n; i++) {
			System.out.println("unique array = " + unique_array[i]);
		}
	}
}
