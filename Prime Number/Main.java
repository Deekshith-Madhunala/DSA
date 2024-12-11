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

		int x = sc.nextInt();
		int isPrime = 0;
		for(int i =1; i<=x; i++) {
			if(x%i == 0) {
				isPrime++;
			}
		}
		if(isPrime == 2) {
			System.out.println("PrimeNumber");
		} else {
			System.out.println("Not PrimeNumber");
		}
	}
}
