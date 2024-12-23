/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/**
 * Switch statement in Java
 */
 
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		
		Integer x = sc.nextInt();
		
		switch(x){
		    case 1:
		        System.out.println("Enterd input number is 1");
		        break;
		    case 2:
		        System.out.println("Entered input number is 2");
		        break;
		    default:
		        System.out.println("Nothing has been given");
		}
	}
}
