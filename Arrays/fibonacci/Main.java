/******************************************************************************

Print Fibonacci Series up to Nth term

Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

Example 2:
Input: 6

Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int first =0, second =1;
		finbonacci(n, first, second);
	}
	
	public static void finbonacci(int n, int first, int second){
	    if(n==-1){
	        return;
	    }
	    System.out.print(first);
	    int temp = first;
	    first = second;
	    second = temp + second;
	    finbonacci(n-1, first, second);
	}
}
