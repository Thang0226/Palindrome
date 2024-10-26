import java.util.Stack;

public class PalindromeChecker {
	private final Stack<Character> stack;
	private final MyQueue<Character> queue;

	public PalindromeChecker() {
		stack = new Stack<>();
		queue = new MyQueue<>();
	}

	public boolean isPalindrome(String s) {
		int length = s.length();
		s = s.toLowerCase();
		for (int i = 0; i < length; i++) {
			stack.push(s.charAt(i));
			queue.enqueue(s.charAt(i));
		}

		for (int i = 0; i < length; i++) {
			char ch1 = stack.pop();
			char ch2 = queue.dequeue();
			if (ch1 != ch2) {
				return false;
			}
		}
		return true;
	}
}
