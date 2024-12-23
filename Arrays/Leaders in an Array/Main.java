/******************************************************************************

Leaders in an Array

Problem Statement: Given an array, print all the elements which are leaders.
A Leader is an element that is greater than all of the elements on its right side in the array.

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

		leadersInAnArray(arr, n);
	}
	public static void leadersInAnArray(int[] a, int n) {

		int  x=0;
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(a[n-1]);
		int maxRightElement= a[n-1];
		for(int i=n-2; i>=0; i--) {
			if(a[i]>=a[i+1] && a[i]>= maxRightElement) {
				maxRightElement = a[i];
				ans.add(a[i]);
			}
		}
		Collections.reverse(ans);

		for(int i=0; i<ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	}
}
