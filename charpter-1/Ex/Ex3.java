import edu.princeton.cs.algs4.*;
public class Ex3 {
	public static void main(String[] args) {
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		if (a == b && b == c) {
			StdOut.println("equal");
		} else {
			StdOut.println("not equal");
		}
	}

}