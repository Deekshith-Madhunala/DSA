/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/**
 * Arrays, Strings and loops in Java
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
// 		Arrays in java

		// array with static size
		int[] intarr = new int[10];

		// array with size of user input
		int[] intarr2 = new int[x];
		Arrays.fill(intarr2, 0);

		String[] stringarr = new String[x];

		intarr2[0] = 1;
		intarr2[1] = 2;
		stringarr[0] = "dee";
		stringarr[1] = "zxe";

		String s = printTheValues(intarr2, stringarr);
		System.out.println(s);

	}

	public static String printTheValues(int[] arr, String[] str) {
// 		for loop
		for(int i=0; i< arr.length; i++) {
			System.out.println("int array = "+ i);
		}

// 		for each loop
		for(String i: str) {
			System.out.println("String array = "+ i);
		}
		return "Printed Them Successfully";
	}
}
