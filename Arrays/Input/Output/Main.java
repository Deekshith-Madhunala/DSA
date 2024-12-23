/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/**
 * Taking variours input from the user 
 */ 

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		
// 		to scan a String from the user 
		String s = sc.nextLine();
		
// 		to scan an Integer from the user
		Integer i = sc.nextInt();
		
		System.out.println("values from the user are : string : {}, Int : {} "+ s+ i);
	}
}
