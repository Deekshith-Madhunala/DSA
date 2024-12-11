/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/**
 * Check if a number is Armstrong Number or not
 * Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
 * 
 * An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits
 */


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		String s = String.valueOf(x);
		int count = s.length(), temp =x;
		int ArmstrongNumber = 0;
		while(x>0){
		    int rem = x%10;
		    ArmstrongNumber += Math.pow(rem, count);
		    x/=10;
		}
		System.out.println(ArmstrongNumber == temp ? true:false);
	}
}
