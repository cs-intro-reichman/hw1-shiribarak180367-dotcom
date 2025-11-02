// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * (double)(lim + 1));
		int b = (int)(Math.random() * (double)(lim + 1));
		int c = (int)(Math.random() * (double)(lim + 1));
		System.out.println(a + " " + b + " " + c);

		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		int mid = a + b + c - max - min;

		System.err.println(min + " " + mid + " " + max);
	}
}
