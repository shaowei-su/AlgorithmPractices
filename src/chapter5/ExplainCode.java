package chapter5;

public class ExplainCode {

	public static void main(String [] args) {
		int n = 16;
		boolean f = (n & (n - 1)) == 0;
		System.out.println(f);
		// Check if n is a power of 2
	}
}
