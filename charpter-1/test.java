import edu.princeton.cs.algs4.*;
import java.util.List;
import java.lang.Math;


public class test {
	public static void main(String[] args) {
		double sum = 0.0;
		int cnt = 0;
		while (!StdIn.isEmpty()) {
			sum += StdIn.readDouble();
			cnt++;
		}
		double avg = sum / cnt;
		StdOut.printf("Average is %.5f\n", avg);
		
	}
}
