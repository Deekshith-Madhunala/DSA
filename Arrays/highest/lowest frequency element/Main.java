/******************************************************************************

Find the highest/lowest frequency element

Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

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

		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		int minElement = -1;
		int maxElement = -1;
		for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {

			if(entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxElement = entry.getKey();
			}
			if(entry.getValue() < minValue) {
				minValue = entry.getValue();
				minElement = entry.getKey();
			}

		}
		System.out.println("Max frequency element =" + maxElement);
		System.out.println("Min frequency element =" + minElement);

	}
}
