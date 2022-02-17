package firstpackage;

import java.util.Arrays;

public class bohan {
	public static void Niven() {
		for (int i = 100; i < 999; i++) {
			if (i % ((i / 100) + ((i / 10) % 10) + (i % 10)) == 0)
				System.out.println(i);
		}
	}

	static long start = System.nanoTime();

	public static char Most(String s) {
		char[] c = new char[s.length()];
		int[] Intc = new int[s.length()];
		int[] IntCount = new int[s.length()];
		int temp = 0;
		int asci = 0;
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					asci = asci + (int) c[i];
				}
			}
			Intc[temp] = asci;
			IntCount[temp] = count;
			temp++;
			asci = 0;
			count = 0;
		}
		int max = Intc[0];
		int counters = IntCount[0];
		for (int i = 0; i < Intc.length; i++) {
			if (Intc[i] > max) {
				max = Intc[i];
				counters = IntCount[i];
			}
		}
		char most = (char) (max / counters);
		return most;
	}

	static long end = System.nanoTime();
	static long elapsedTime = end - start;

	public static int larger_than_ave(int a[]) {
		int avg = 0;
		int sum = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > avg)
				count++;
		}
		return count;
	}

	public static int[] either(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length];
		int count = 0;
		int temp = 0;
		boolean f = false;
		if (arr1.length >= arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						f = true;
						break;
					}
				}
				if (f == false) {
					count++;
					arr[temp] = arr1[i];
					temp++;
				}
				f = false;
			}
		}

		for (int k = 0; k < arr2.length; k++) {
			for (int t = 0; t < arr1.length; t++) {
				if (arr2[k] == arr1[t]) {
					f = true;
					break;
				}
			}
			if (f == false) {
				count++;
				arr[temp] = arr2[k];
				temp++;
			}
			f = false;
		}

		int[] arrCopy = new int[count];
		for (int j = 0; j < arrCopy.length; j++) {
			arrCopy[j] = arr[j];
		}
		int[] secCopy = new int[arrCopy.length];
		for (int i = 0; i < arrCopy.length; i++) {
			for (int j = 0; j < arrCopy.length; j++) {
				if (arrCopy[j] != arrCopy[i])
					secCopy[j] = arrCopy[j];
			}
		}
		return secCopy;
	}

	static long start1 = System.nanoTime();

	public static char Most2(String s) {
		int most = 0;
		char mostl = 'a';
		for (char l = 'a'; l <= 'z'; l++) {
			int temp2 = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == l) {
					temp2++;
				}
			}
			if (temp2 >= most) {
				most = temp2;
				mostl = l;
			}
		}
		return mostl;
	}

	static long end1 = System.nanoTime();
	static long elapsedTime1 = end1 - start1;



	public static void main(String[] args) {
		// Niven();
//		System.out.println(Most("abrazxwbdauta"));
//		System.out.println("My code ran for " + elapsedTime + " time");
//		System.out.println("abrazxwbdauta");
//		System.out.println("Others code ran " + elapsedTime1 + "time");
//		int[] arr1 = { -5, -10, 0, 40, 590, -214, 400 };
//		int[] arr2 = { -5, -10, 0, 40, 590, -214, 400, 290 };
//		int[] arr3 = { 5, -3, 0, 6, -9, 6, 4, 0, 8, 6 };
//		int[] arr4 = { 7, 8, 0, 3, 3, 4, 4 };
//		// System.out.println(larger_than_ave(arr));
//		int[] arrnew = either(arr3, arr4);
//		System.out.println(Arrays.toString(arrnew));
		//System.out.println(powerful(72));
	}

}
