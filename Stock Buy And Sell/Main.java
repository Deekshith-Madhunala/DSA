/******************************************************************************

Stock Buy And Sell

Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

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

		buyAndSellStock(arr, n);
	}

	public static void buyAndSellStock(int[] prices, int n) {
		int l=0, r=l+1, profit = 0;
		while(r<prices.length) {
			if(prices[r] < prices[l]) {
				l=r;
			}
			profit = Math.max(profit, prices[r]- prices[l]);
			r++;
		}
		System.out.println("profit = " +profit);
	}
}
