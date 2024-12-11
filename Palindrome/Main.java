/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

/**
 * Check if a number is Palindrome or Not
 * Given an integer N, return true if it is a palindrome else return false.
 * A palindrome is a number that reads the same backward as forward.
 * For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
 */

import java.util.*;

public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
// 		user input
		int n = sc.nextInt(), temp =n;
		int remainder =0, reversedNumber=0;
		while(n>0) {
			remainder = n%10;
			reversedNumber = reversedNumber*10 + remainder;
			n/=10;
		}
		if(reversedNumber == temp) {
			System.out.println(true);
		} else {

			System.out.println(false);
		}
	}
}
