/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

// 		user input
		int n = sc.nextInt();
		int ans =0,reminder=0;
		while(n>0) {
			reminder = n%10;
			ans = ans * 10 + reminder;
			n/=10;
		}
		System.out.println(ans);

	}
}