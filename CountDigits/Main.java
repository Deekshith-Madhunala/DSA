/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

/**
 * Count digits in a given Number
 *
 * Given an integer N, return the number of digits in N.
 */

import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// take an integer from the user
		int n = sc.nextInt();

		// Method 1
		// String str = String.valueOf(x);
		// System.out.println(str.length());

		// Method 2
		// int count =0;
		// while(x>0){
		//     count++;
		//     x/=10;
		// }
		// System.out.println(count);


		// Method 3
// 		System.out.println((int)Math.log10(x)+1);

        // problem link
        // https://www.codingninjas.com/codestudio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
        
        
        
		int count = 0, temp = n;
		while (n > 0) {
			int remainder = n % 10;
			System.out.println("remainder="+ remainder);
			System.out.println("div="+ temp%remainder);

			if (remainder !=0 && temp % remainder == 0) {
				count++;
			}
			n /= 10;
		}
		System.out.println(count);
	}
}
