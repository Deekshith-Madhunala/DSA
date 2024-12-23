/******************************************************************************

Factorial of a Number : Iterative and Recursive

Problem Statement: Given a number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

Note: X  is always a positive number. 

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int fact = 1;
	    System.out.print(factorial(n, fact));
	}
	
	public static int factorial(int n, int fact){
	    if(n==1 || n==0){
	        return n;
	    }
	    return n*factorial(n-1, fact);
	}
}