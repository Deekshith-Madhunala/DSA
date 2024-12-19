/******************************************************************************

Find the Majority Element that occurs more than N/2 times

Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array.
You may consider that such an element always exists in the array.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];

		for(int i=0; i<n; i++ ) {
			v[i]=sc.nextInt();
		}

		majorityElement(v, n);
	}

	public static void majorityElement(int[] v, int n) {

		int element=v[0], count = 0;

		for(int i=0; i<n; i++) {
			if(element == v[i]) {
				count++;
			} else {
				count--;
			}
			if(count ==0) {
				element =v[i];
				count++;
			}
		}
		System.out.println("majorityElement = "+element);
	}
}
