/******************************************************************************

Count frequency of each element in the array

Problem statement: Given an array, we have found the number of occurrences of each element in the array.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println();

		HashMap<Integer, Integer> hashMap= new HashMap<>();
		for(int i=0; i<n; i++) {
			if(hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
			} else {
				hashMap.put(arr[i], 1);
			}
		}

		for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {

			System.out.println(entry.getKey()+ " " +entry.getValue());
		}

	}
}
