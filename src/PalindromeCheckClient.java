public class PalindromeCheckClient {
	public static void main(String[] args) {

		String str = "Able was I ere I saw Elba";

		System.out.println("Input string:\n\t" + str);
		PalindromeChecker checker = new PalindromeChecker();
		if (checker.isPalindrome(str)) {
			System.out.println("This is a palindrome.");
		} else {
			System.out.println("This is NOT a palindrome.");
		}
	}
}
