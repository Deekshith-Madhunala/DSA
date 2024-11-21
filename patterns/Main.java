/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/**
 * Building patterns
 */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		printFiveByFiveStar(x);
		printOneToFiveStar(x);
		printNumbersEachRow(x);
		printOneToFiveNumbers(x);
		printOneToFiveStarReverse(x);
		printNumbersEachRowReverse(x);
		printPyramid(x);
		printPyramidReverse(x);
		printDiamond(x);
		printLeftPyramid(x);
		printZeroAndOneTraingle(x);
		printLeftAndRightNumbers(x);
		printNumberTraingle(x);
		printAlphabetTraingle(x);
		printAlphabetTraingleReverse(x);
		printAlphabets(x);
		printAlphabetsTraingles(x);
		printRightTriangle(x);
		printTaingleInSquare(x);
		printPatternH(x);
		printSquare(x);
		printNumberSquare(x);
	}

	public static void printFiveByFiveStar(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}
	public static void printOneToFiveStar(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printNumbersEachRow(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printOneToFiveNumbers(int x) {
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printOneToFiveStarReverse(int x) {
		for(int i=x; i>=0; i--) {
			for(int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printNumbersEachRowReverse(int x) {
		for(int i=x; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printPyramid(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<((2*i)+1); j++) {
				System.out.print("*");
			}
			for(int j=0; j<x-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printPyramidReverse(int x) {
		for(int i=x; i>0; i--) {
			for(int j=0; j<x-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<((2*i)-1); j++) {
				System.out.print("*");
			}
			for(int j=0; j<x-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printDiamond(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<((2*i)+1); j++) {
				System.out.print("*");
			}
			for(int j=0; j<x-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=x; i>0; i--) {
			for(int j=0; j<x-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<((2*i)-1); j++) {
				System.out.print("*");
			}
			for(int j=0; j<x-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void printLeftPyramid(int x) {
		for(int i=1; i<=2*x-1; i++) {
			int stars =i;
			if(i>x) {
				stars = 2*x-i;
			}
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printZeroAndOneTraingle(int x) {
		int val;
		for(int i=0; i<x; i++) {
			val = i%2 ==0 ? 1 : 0;
			for(int j=0; j<=i; j++) {
				System.out.print(val);
				val = 1-val;
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printLeftAndRightNumbers(int x) {
		int gap = 2*(x-1);
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}

			for(int j=1; j<=gap; j++) {
				System.out.print(" ");
			}

			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
			gap -=2;

		}
		System.out.println();

	}

	public static void printNumberTraingle(int x) {
		int val =1;
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(val++ +" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printAlphabetTraingle(int x) {
		for(int i=1; i<=x; i++) {
			char val ='A';
			for(int j=1; j<=i; j++) {
				System.out.print(val++ +" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printAlphabetTraingleReverse(int x) {
		for(int i=x; i>=0; i--) {
			char val ='A';
			for(int j=1; j<=i; j++) {
				System.out.print(val++ +" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printAlphabets(int x) {
		char val ='A';
		for(int i=1; i<=x; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(val);
			}
			val++;
			System.out.println();
		}
		System.out.println();
	}
	public static void printAlphabetsTraingles(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x-i-1; j++) {
				System.out.print(" ");
			}
			int letters = 2*i +1;
			int bp = letters/2;
			char val = 'A';
			for(int j=1; j<=letters; j++) {
				System.out.print(val);
				if(j<= bp) val++;
				else val--;
			}

			for(int j=0; j<x-i-1; j++) {
				System.out.print(" ");
			}

			val++;
			System.out.println();
		}
		System.out.println();
	}
	public static void printRightTriangle(int x) {
		char val = 'E' ;
		for(int i=0; i<x; i++) {
			char temp = val;
			for(int j=0; j<=i; j++) {
				System.out.print(temp++);
			}
			val--;
			System.out.println();
		}
		System.out.println();
	}
	public static void printTaingleInSquare(int x) {
		int temp = x;
		for(int i=0; i<x; i++) {
			for(int j=0; j<(2*temp)/2; j++) {
				System.out.print("*");
			}

			for(int j=0; j< 2*i; j++) {
				System.out.print(" ");
			}

			for(int j=(2*temp)/2; j>0; j--) {
				System.out.print("*");
			}
			temp--;
			System.out.println();
		}
		temp = x;
		for(int i=x; i>0; i--) {
			for(int j=i; j<=x; j++) {
				System.out.print("*");
			}

			for(int j=1; j< (2*temp-1); j++) {
				System.out.print(" ");
			}

			for(int j=i; j<=x; j++) {
				System.out.print("*");
			}
			temp--;
			System.out.println();
		}
		System.out.println();
	}

	public static void printPatternH(int x) {
		int temp = x, gap = 2*temp-1;
		for(int i=(2*x-1); i>0; i--) {
			for(int j=i; j<=x; j++) {
				System.out.print("*");
			}

			for(int j=1; j< gap; j++) {
				System.out.print(" ");
			}

			for(int j=i; j<=x; j++) {
				System.out.print("*");
			}
			temp--;
			System.out.println();
		}
		System.out.println();
	}

	public static void printSquare(int x)
	{
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				if(i==0 || j==0 || j == x-1 || i == x-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void printNumberSquare(int x)
	{
		for(int i=0; i<2*x-1; i++) {
			for(int j=0; j<2*x-1; j++) {
				int top = i, left =j;
				int right = (2*x-2) - j;
				int down = (2*x-2) - i;
				System.out.print(x- Math.min(Math.min(top,down), Math.min(left, right)));
			}
			System.out.println();
		}
	}
}
