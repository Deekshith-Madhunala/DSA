/******************************************************************************

Count Maximum Consecutive One's in the array

Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
	    countMaxOnes(arr, n);
	}
	
	public static void countMaxOnes(int[] arr, int n){
	    
	    int oneCount = 0, maxOneCount=0;
	    for(int i=0;i<n;i++){
	        if(arr[i] == 1 ){
	            oneCount++;
	        } else {
	            oneCount =0;
	        }
    	    maxOneCount = Math.max(maxOneCount, oneCount);
	    }
	    System.out.println("max one occuredCount = " + maxOneCount);
	}
}
