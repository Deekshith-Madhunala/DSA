/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

/**
 * Java if else
 */
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner sc = new Scanner(System.in);

		Integer isValid = sc.nextInt();
		if(isValid == 5) {
			System.out.println("given string is valid "+ isValid);
		} else if(isValid ==6) {
			System.out.println("given string is from  valid "+ isValid);
		} else {
			System.out.println("given string is else valid "+ isValid);
		}
	}
}
