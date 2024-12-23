/******************************************************************************

Problem Statement: You are given a positive integer n. Your task is to find and return its square root. If b nb  is not a perfect square,
then return the floor value of 'sqrt(n)'.

Note: The question explicitly states that if the given number, n, is not a perfect square, our objective is to find the maximum number, x,
such that x squared is less than or equal to n (x*x <= n).
In other words, we need to determine the floor value of the square root of n.

*******************************************************************************/
import java.util.*;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("peak element = "+ squareRoot(n));
	}

	public static int squareRoot(int N) {
		long l=1, r=N;
		long ans= 0;

		while(l<=r) {
			long mid = l + (r-l)/2;
			long prod = mid*mid;
			if(prod<=N) {
				ans= mid;
				l= mid+1;
			} else {
				r=mid-1;
			}
		}
		return (int)ans;
	}
}
