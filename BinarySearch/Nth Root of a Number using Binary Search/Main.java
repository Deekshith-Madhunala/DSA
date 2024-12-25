/******************************************************************************

Nth Root of a Number using Binary Search


121

18
Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised
to the power N equals M. If the 'nth root is not an integer, return -1.

*******************************************************************************/
import java.util.*;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println("peak element = "+ NthRoot(n, m));
	}

	public static int NthRoot(int n, int m) {

		int l=1, r=m;
		int ans= -1;

		while(l<=r) {
			int mid = l + (r-l)/2;
			// double prod = Math.pow(mid, n);
			int p = product(n, m, mid);
			if(p==1) {
				return mid;
			} else if(p == 0) {
				l=mid+1;
			} else {
				r= mid-1;
			}
		}
		return -1;
	}

	public static int product(int n, int m, int mid) {
		long ans = 1;
		for(int i=1; i<=n; i++) {
			ans *= mid;
			if(ans>m) return 2;
		}
		if(ans == m) return 1;
		return 0;
	}
}


