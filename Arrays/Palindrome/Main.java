/******************************************************************************

Check if the given String is Palindrome or not

Problem Statement: "Given a string, check if the string is palindrome or not."
A string is said to be palindrome if the reverse of the string is the same as the string.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
// 		using inbuilt reverse method
		sb.reverse();
		
		if(str.equals(sb.toString())) {
			System.out.println("Polindrome");
		} else {
			System.out.println("Not a Polindrome");
		}
	}
}
