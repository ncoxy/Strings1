import java.util.Random;

public class Mean {
	private static Random r = new Random(5345);

	public static void main(String[] args) {
		
		int[] randomArray = makeRandom(1000, 100);
		System.out.print("The average of the array is: ");
		System.out.println(mean(randomArray) + ".");

		System.out.print("The average from index 40 to index 45 is: ");
		System.out.println(meanOfRange(randomArray, 40, 45) + ".");

	}
	// mean of the numbers in a
	public static double mean(int[] a) {
		double sum = 0;
		for (int i=0, t=0; i<a.length; i++, t++) {
			sum = sum + a[i];

		}
		sum = (sum / a.length);

		return sum;
	}

	// mean of a from index start to index end inclusive
	public static double meanOfRange(int[] a, int start, int end) {
		double sum = 0;
		double length = end - start;
		for (int i=start; i< end; i++) {
			sum = sum + a[i];
		}
		sum = (sum / length);
		return sum;
	}

	// creates an integer array of length size with numbers ranging
	// from 0 to range
	public static int[] makeRandom(int size, int range) {
		int[] a = new int[size];

		for (int i=0; i<a.length; i++) {
			a[i] = r.nextInt(range + 1);
		}

		return a;
	}
}