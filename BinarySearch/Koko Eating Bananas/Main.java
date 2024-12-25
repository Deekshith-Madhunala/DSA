/******************************************************************************
Koko Eating Bananas


Problem Statement: A monkey is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also given, 
which denotes the time (in hours) for all the bananas to be eaten.

Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas. If the pile contains less than ‘k’ bananas, 
then the monkey consumes all the bananas and won’t eat any more bananas in that hour.

Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.
*******************************************************************************/
import java.util.*;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int h = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(minimumBananas(arr, h));
	}

	public static int minimumBananas(int[] piles, int h) {
		int maxEle =  maxElement(piles);
		int l=1, r= maxEle, ans;

		while(l<=r) {
			int mid = l + (r-l)/2;

			int hours = hoursperBanana(piles, mid);

			if(hours<=h) {
				r= mid-1;
			} else {
				l =mid+1;
			}
		}
		return l;
	}

	public static int hoursperBanana(int[] piles, int hourly) {
		int hours = 0;
		for(int i=0; i<piles.length; i++) {
			hours += Math.ceil((double)piles[i]/(double)hourly);
		}
		return hours;
	}

	public static int maxElement(int[] piles) {
		int max = piles[0];
		for(int i=1; i<piles.length; i++) {
			if(piles[i]> max) {
				max = piles[i];
			}
		}
		return max;
	}
}
