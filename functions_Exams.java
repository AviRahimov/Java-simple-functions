package firstpackage;

import java.util.Arrays;
import java.util.Iterator;

public class functions_Exams {

	public static int fact (int n) {//Atzeret
	if(n==0)
		return 1;
	return n*fact(n-1);
	}
//*************************************************************
	public static int sum(int num) {
		if(num==1)
			return 1;
		return num + sum(num-1);
	}
//*************************************************************
	public static void printLine(int num) {
		if(num==0)
			return;
		System.out.print("*");
		printLine(num-1);
	}
//*************************************************************
	public static void triangle(int num) {
		if(num==0)
			return;
		printLine(num);
		System.out.println();
		triangle(num-1);
	}
//*************************************************************
	public static void PrintReverseTriangle(int num) {
	int rev_num = 1;
		if(rev_num > num)
			return;
		System.out.print("*");
		PrintReverseTriangle(num-1);
		rev_num++;
	}
	
//*************************************************************
	public static void printarr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

//*************************************************************
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

//*************************************************************
	public static int gcd(int p, int q) {
		int a = Math.max(p, q);
		int b = Math.min(p, q);
		int max_gcd = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				max_gcd = i;
			}
		}
		return max_gcd;
	}

//*************************************************************
	public static boolean rowsSorted(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			if (isSorted(mat[i]) == false)
				return false;
		}
		return true;
	}

//*************************************************************
	public static double arraySum(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

//*************************************************************
	public static double arrayMean(int[] arr) {
		return arraySum(arr) / arr.length;
	}

	public static double arrayStdev(int[] arr) {
		double sum2 = 0;
		double sum = 0;
		double stdev;
		for (int i = 0; i < arr.length - 1; i++) {
			sum += arr[i] - arrayMean(arr);
			sum2 += sum;
		}
		stdev = Math.sqrt((Math.abs(sum2)) / (arr.length));
		return stdev;
	}

//*************************************************************
	public static boolean palindrom(int[] arr) {
		int j = 0;
		int[] arr2 = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[j] = arr[i];
			j++;
		}
		for (int k = 0; k < arr.length; k++) {
			if (arr2[k] != arr[k])
				return false;
		}
		return true;
	}

//*************************************************************
	public static void swap(int i, int j, int[] arr) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		printarr(arr);

	}

//*************************************************************
	public static void evenOddSort(int[] arr) {
		int temp = 0;
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr2[temp] = arr[i];
				temp++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				arr2[temp] = arr[j];
				temp++;
			}
		}
		printarr(arr2);
	}

//*************************************************************
	public static long round(double d) {
		return (long) d;
	}

//*************************************************************
	public static String mystery(String s) {
		int len = s.length();
		if (len <= 1)
			return s;
		String a = s.substring(0, len / 2);
		String b = s.substring(len / 2, len);
		String x = mystery(a);
		String y = mystery(b);
		return y + x;
	}

//*************************************************************
	public static int trace2(int[][] a2) {
		int sum = 0;
		int row = 0;
		int column = 0;
		while (row < a2[0].length) {
			sum += a2[column][row];
			row++;
			column++;
		}
		return sum;
	}

//*************************************************************
	public static String removeSubString(String str1, String str2) {
		if (!str1.contains(str2))
			return str1;
		String ans = str1.substring(0, str1.indexOf(str2));
		ans += str1.substring(str1.indexOf(str2) + str2.length());
		return ans;
	}

//*************************************************************
	public static void partialSort(int[] arr, int startIndex, int lastIndex) {
		 for (int i = startIndex; i <= lastIndex; i++) {
			 int minIndex = i;
			for (int j = i+1; j <= lastIndex; j++) {
				if(arr[j]<arr[minIndex])
					minIndex = j;
			}
			tirgul.swapArray(arr, i, minIndex);
		}
	}
	public static boolean validPassword(String s) {
		boolean valid = false;
		if (s.contains(" "))
			return false;
		if (s.length() >= 6) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
					valid = true;
					break;
				} else
					valid = false;
			}
			if(s.contains("@") || s.contains("$") || s.contains("#") || s.contains("!") || s.contains("%"))
				valid = true;
			else
				valid = false;
		}
		return valid;
	}
//Fibonacci:
	public static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		return fib(n-2) + fib(n-1);
	}
	public static void main(String[] args) {

//		System.out.println((int) arraySum(arr));
		String str = "abcde";
		String st = "ab";
		int[] arr = { 6, 3, 2, 7, 5 };
		int[] arr3 = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
		int[][] mat = { { 1, 2, 3 }, { 3, 4, 5 }, { 9, 10, 22 } };
//System.out.println("the avarge of the array is: " + arrayMean(arr));
//System.out.println(arrayStdev(arr));		
//System.out.println(palindrom(arr3));	
//swap(2, 3, arr);
		// evenOddSort(arr);
		// System.out.println(isSorted(arr));
		// System.out.println(rowsSorted(mat));
		// System.out.println(gcd(512,9048));
//System.out.println(round(21474836479.3));
		// System.out.println(mystery("abcd"));
		// System.out.println(trace2(mat));
		//System.out.println(removeSubString(str, st));
		//System.out.println(fact(5));
		//System.out.println(sum(9));
	    //triangle(5);
		//PrintReverseTriangle(5);
//		partialSort(arr,2,4);
//		System.out.println(Arrays.toString(arr));
		//System.out.println(validPassword("1a2s3di23!r#2r"));
		//System.out.println(fib(7));
		
	}
}
