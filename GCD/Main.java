/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

/**
 * GCD of two numbers
 * Given two integers N1 and N2, find their greatest common divisor.
 * The Greatest Common Divisor of any two integers is the largest number that divides both integers.
 */

import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
// 		user input
		int x = sc.nextInt();
		int y = sc.nextInt();

// 		int i=1, gcd=1;
// 		int n = Math.min(x, y);
// 		while(n>0) {
// 			if(x%n == 0 && y%n==0) {
// 				break;
// 			}
// 			n--;
// 		}
		System.out.println("gcd = " + gcd(x, y));
	}
	
	public static int gcd(int x, int y){
	    if(y==0){
	        return x;
	    }
	    return gcd(y, x%y);
	}
}
