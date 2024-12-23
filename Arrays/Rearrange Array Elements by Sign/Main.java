/******************************************************************************

Rearrange Array Elements by Sign

Variety-1

Problem Statement:

Thereb s an array b Ab  of size b Nb  with an equal number of positive and negative elements. Without altering the relative order of positive and
negative elements, you must return an array of alternately positive and negative values.

Note: Start the array with positive elements.

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

		rearrangeArrayElementsBySign(arr, n);
	}

	public static void rearrangeArrayElementsBySign(int[] nums, int n) {

		int pos = 0, neg = 1, i = 0;
		int[] ans = new int[n];
		while (pos < n || neg < n) {
			if (nums[i] > 0) {
				ans[pos] = nums[i];
				pos += 2;
			} else {
				ans[neg] = nums[i];
				neg += 2;
			}
			i++;
		}
		for(int j=0; j<n; j++) {
			System.out.println(ans[j]+" ");
		}
	}
}
