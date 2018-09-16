import edu.princeton.cs.algs4.*;
public class Ex9 {
	public static void main(String[] args) {
		int N = Integer.valueOf(args[0]);
		StdOut.println(myToBinaryString(N));
	}

	public static String myToBinaryString(int N) {
		String s = "";
		while (N > 0) {
			s = (N % 2) + s;
			N /= 2;
		}

		return s;
	}
}