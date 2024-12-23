/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/**
 *
 * Print all Divisors of a given Number
 * Problem Statement: Given an integer N, return all divisors of N.
 *
 * A divisor of an integer N is a positive integer that divides N without leaving a remainder.
 * In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.
 *
 */

import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for(int i=1; i<=x/2; i++) {
			int rem = x%i;
			if(rem ==0) {
				System.out.println(i+ " ");
			}
		}
		System.out.println(x);
	}
}
