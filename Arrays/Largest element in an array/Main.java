/******************************************************************************

Find the Largest element in an array

Problem Statement: Given an array, we have to find the largest element in the array.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		int maxElement = Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
		    maxElement = Math.max(maxElement, arr[i]);
		}
		System.out.print("Max element = "+ maxElement);
	}
}
