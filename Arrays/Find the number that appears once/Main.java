/******************************************************************************

Find the number that appears once, and the other numbers twice

Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

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

// 		findNumberAppearsTwice(arr, n);
		findNumberAppearsTwiceUsingXOR(arr, n);
	}

	public static void findNumberAppearsTwiceUsingXOR(int[] arr, int n) {

		int single_number = 0;

		for(int i=0; i<n; i++) {
			single_number ^= arr[i];
		}
		System.out.println(single_number);

	}


	public static void findNumberAppearsTwice(int[] arr, int n) {

		HashMap<Integer, Integer> duplicate_map = new HashMap<>();

		for(int i=0; i<n; i++) {
			if(duplicate_map.containsKey(arr[i])) {
				duplicate_map.put(arr[i], duplicate_map.get(arr[i])+ 1);
			} else {

				duplicate_map.put(arr[i], 1);
			}
		}

		for(Map.Entry<Integer, Integer> map: duplicate_map.entrySet()) {
			System.out.println("key = " + map.getKey() + " Value = "+ map.getValue());

			if(map.getValue() == 1) {
				System.out.println("the following element occurs only once = " + map.getKey());
			}
		}
	}
}
