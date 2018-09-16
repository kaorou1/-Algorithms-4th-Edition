import edu.princeton.cs.algs4.*;
public class Ex26 {
	public static void main(String[] args) {
		int a = 2;
		int b = 9;
		int c = 5;
		int t;

		if (a > b) {
			t = a;
			a = b;
			b = t;
		}

		if (a > c) {
			t = a;
			a = c;
			c = t;
		}

		if (b > c) {
			t = b;
			b = c;
			c = t;	
		}
	}

}