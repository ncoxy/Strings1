public class Array {

	public static void main(String[] args) {
		int[] data = new int [10];
		// doubleit();

		// for (int i = 0; i < data.length; i++) {
		// 	data[i] = 10;
		// }

		// for (int i=0; i < data.length; i++) {
		// 	data[i] = 10 - i;
		// 	data[i] = data[i - 1]
		// }
		// for (int i=0; i , data.length; i++) {
			// System.out.println(data[i] + " ");
		// }

		// sum(data);
		largest(data);

	}
	public static int[] doubleIt(int[] a){
		for (int i=0; i<a.length; i++) {
			a[i] = a[i] * 2;
		}
		return a;

	}
	public static int[] sum(int[] a){
		int sumeven = 0;
		int sumodd = 0;
		int sumall = 0;
		for (int i=0, v=10; i<a.length; i++, v--) {
			if ((i%2) == 0) {
				sumeven = sumeven + v;
			}else{
				sumodd = sumodd + v;
			}
			sumall = sumall + v;
		}
		System.out.println("Total sum:" + sumall);
		System.out.println("Even sum:" + sumeven);
		System.out.println("Odd sum:" + sumodd);
		return a;
	}

	public static int[] largest(int[] a) {
		int large1 = 0;
		int large2 = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] > large1) {
				
			}
	}

	public static int[] zero(int[] a){

		for (int i=0; i <a.length; i++) {
			if (a[i])
			
		}
	}



	public static void printArray(int[] a) {
		for (int i=0; i<a.length; i++) {
		System.out.println(a[i] + " ");

		}
		System.out.println();
}
}