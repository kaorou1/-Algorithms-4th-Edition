public class Ex20 {
	public static void main(String[] args) {
		System.out.println(ln(200));
		System.out.println(ln(200));
	}

	public static double ln(double N) {
		if (N == 1) {
			return 0;
		} else {
			return Math.log(N) + ln(N - 1);
		}
	}

	public static double ln1(int N) {
		if (N == 0) {
			return 0;
		} else {
			return Math.log(N) + ln(N - 1);
		}
	}
}