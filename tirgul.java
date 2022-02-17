package firstpackage;

import java.util.Arrays;
import java.util.Iterator;

public class tirgul {
// *****************************************************, Recursion:
	public static void print(int n) {
		if (n == 0)
			return;
		else
			System.out.println(n);
		print(n - 1);
	}

	public static int sum(int x) {
		if (x == 0)
			return 0;
		return sum(x - 1) + x;
	}

//*****************************************************, Sort:
//Bubble sort:
	public static void bubblesort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1])
					swapArray(arr, j, j + 1);
			}
		}
	}

	public static void swapArray(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void swapInt(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	public static char[] swapChar(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		return c;
	}

//Selection sort:
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;

			}
			swapArray(arr, i, minIndex);
		}
	}
//selection sort by Avi
	public static void SelectionSort(int[] arr) {
		int minIndex;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			minIndex = FindMinIndex(arr, i, n);
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		functions_Exams.printarr(arr);
	}

	public static int FindMinIndex(int[] arr, int initial, int end) {
		int minIndex = initial;
		for (int i = initial; i < end; i++) {
			if (arr[i] < arr[minIndex])
				minIndex = i;
		}
		return minIndex;
	}
//tirgul 7 Q1
	public static int fact(int n) {
		if(n==0 || n==1)
			return 1;
		return fact(n-1)*n;
	}
//tirgul 7 Q2
	public static int sum1(int num) {
		if (num == 0)
			return 0;
		return sum1(num - 1) + num;
	}
//tirgul 7 Q3
	public static void printLine(int num) {
		if(num==0)
			return;
		System.out.print("*");
		printLine(num-1);
	}
//tirgul 7 Q4
	public static void triangle(int num) {
		if(num==0)
			return;
		printLine(num);
		System.out.println();
		triangle(num-1);
	}
//tirgul 7 Q5
	public static void PrintReverseTriangle(int num) {
		if (num == 0)
			return;
		PrintReverseTriangle(num - 1);
		printLine(num);
		System.out.println();
	}
//tirgul 7 Q7
	public static int pow(int m, int n) {
		if(n==0)
			return 1;
		return m*pow(m,n-1);
	}
//tirgul 7 Q8
	public static String reverseString(String s) {
		if(s.length()==0)
			return "";
		return s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1));
	}
//tirgul 7 Q9
	public static int sumArr(int [] arr, int n) {
		if(n==0)
			return 0;
		return arr[n-1] + sumArr(arr,n-1);
	}
//tirgul 7 Q10
	public static int sumDigit(int n) {
		if(n/10==0)
			return n;
		return n%10 + sumDigit(n/10);
	}
	public static void main(String[] args) {
		// System.out.println(sum(7));
		int[] arr1 = { 4, 2, 23, 2, 32, 4, 5 };
		selectionSort(arr1);
		//System.out.println(Arrays.toString(arr1));
		int n = 5;
		System.out.println("Fact n is: " + fact(n));
		System.out.println("Sum from 1 to n is: " + sum1(n));
		System.out.println("n stars right there->");
		printLine(n);
		System.out.println("triangle with n stars");
		triangle(n);
		System.out.println("Inverted triangle with n stars");
		PrintReverseTriangle(n);
		System.out.println("2^5 is: " + pow(2,5));
		System.out.println("Inverted Hello is: " + reverseString("Hello"));
		int [] arr2 = {1,2,3,4,5};
		System.out.println(sumArr(arr2,2));
		System.out.println(sumDigit(123412));
		/*
		 * System.out.println((int)(Math.random()*10)); int min = 50; int max = 100;
		 * range:[50,100) System.out.println((int)(Math.random()*(max-min)) + min);
		 ******************************************************************
		 * switch (0) case 2: System.out.println("not equal"); break; case 9:
		 * System.out.println("the same num"); break; default:
		 * System.out.println("null");
		 ******************************************************************
		 * int num;
		 * 
		 * do { num = MyConsole.readInt("enter num between 1-5: "); } while(num < 1 ||
		 * num > 5);
		 ******************************************************************
		 * for(int i=1; i<=10;i++) { if(i % 2 == 0) { //only the odd numbers continue; }
		 * for(int j=1;j<=10;j++) { System.out.print(i*j + "\t"); }
		 * System.out.println(); }
		 * 
		 * int n1=1; //targil 1 int n = MyConsole.readInt("Write a number: "); for(int
		 * i=1;i<=n;i++) { n1 = n1*i;
		 * 
		 * } System.out.println(n1);
		 */
		// **********************************************************
		/*
		 * int x = MyConsole.readInt("Write x: "); int y =
		 * MyConsole.readInt("Write y: "); int xy=1; int t = 0; while(t!=y) { xy=xy*x;
		 * t++; } System.out.println("x^y is:" + xy);
		 */
		// **************************************************************
		/*
		 * int n = MyConsole.readInt("Enter a num: "); int[] x = new int[n + 2]; for
		 * (int i = 2; i <= n + 1; i++) { x[0] = 1; x[1] = 1; x[i] = x[i - 1] + x[i -
		 * 2]; System.out.println("the number " + (i - 1) + " in fibonachi is: " + x[i -
		 * 2]);
		 */// **************************************************************************
		/*
		 * int n = MyConsole.readInt("enter a num: "); int counter = 0; int[] arr = new
		 * int[n];//its not completely true because n is the length but not the numbers
		 * from 0 to n for (int i = 0; i < arr.length; i++) { arr[i] =
		 * (int)(Math.random()*n); if (arr[i] == 0) counter++; }
		 * System.out.println("the num of zeros is " + counter); //
		 * *****************************************************************************
		 * *****
		 */
		/*
		 ************************************************************************************
		 * int counter = 0; int[] arr2 = new int[5]; int[] arr = { 1, 2, 3, 4, 5 }; for
		 * (int i = arr.length - 1; i >= 0; i--) { arr2[counter] = arr[i]; counter++; }
		 * for (int j = 0; j < arr.length; j++) { arr[j] = arr2[j]; }
		 * System.out.println(Arrays.toString(arr));
		 *//*
			 * int N = MyConsole.readInt("enter a num: "); int [] arr= new int[N]; for(int i
			 * = 0;i<arr.length;i++) { arr[i]=(int)(Math.random()*N); } for(int j =
			 * 0;j<arr.length;j++) { if(arr[j]%3==0) System.out.println(arr[j]); }
			 */
		/*
		 * double min; double arr[] = new double[3]; for (int i = 0; i < arr.length;
		 * i++) { arr[i] = MyConsole.readDouble("enter a double num: "); }
		 * System.out.println(Arrays.toString(arr)); for (int j = 1; j < arr.length;
		 * j++) { min = arr[0]; if (arr[j] < min) { min = arr[j]; arr[j] = arr[0];
		 * arr[0] = min; } if (arr[j] < arr[j - 1]) { min = arr[j]; arr[j] = arr[j - 1];
		 * arr[j - 1] = min; } } System.out.println(Arrays.toString(arr));
		 */
//*****************************************************, String:
		String s = "abc";
		char[] arr = new char[s.length()];
		// System.out.println(a.toLowerCase() == s);
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		// Here we can sort or do some action on the string because we have array of
		// chars(more efficient)
		String s1 = "";
		for (int j = 0; j < arr.length; j++) {
			s1 += arr[j];
		}
		// System.out.println(s.substring(1));// return bc because index 1 on s is b so
		// it return b to the end of the string
		// System.out.println(s.substring(0, 1));//return a because the first index(0)
		// is a and the second index(1) is 1 but its not including the the second index
		// (b)
		// System.out.println(s.contains("a"));//return true because the String s
		// contains a
		/*
		 * //Qoestion 5 exam 7: String str = MyConsole.readString("Write a word: "); int
		 * count = 1; for (int i = 0; i < str.length(); i++) { if (str.charAt(i) < 65 ||
		 * str.charAt(i) > 122) count++; } System.out.println(count);
		 */

		/* Question 7 exam 7: String st =
		String st = MyConsole.readString("Write a word with 3 letters: ");
		String copyst = st.toLowerCase();
		char[] copy = new char[copyst.length()];
		char[] c = new char[st.length()];
		for (int i = 0; i < c.length; i++) {
			copy[i] = copyst.charAt(i);
			c[i] = st.charAt(i);
		}
		if (copy[0] > copy[1]) {
			copy = swapChar(copy, 0, 1);
			c = swapChar(c, 0, 1);
		}
		if (copy[1] > copy[2]) {
			copy =swapChar(copy, 1, 2);
			c = swapChar(c, 1, 2);
		}
		if (copy[0] > copy[1]) {
			copy =swapChar(copy, 0, 1);
			c = swapChar(c, 0, 1);
		}
		String sort = "";
		for (int i = 0; i < c.length; i++) {
			sort += c[i];
		}
		System.out.println(sort);

/*Question 9 exam 7:
		boolean permo = false;
		String str1 = MyConsole.readString("Write a word: ");
		String str2 = MyConsole.readString("Write a second word: ");
		char[] c1 = new char[str1.length()];
		char[] c2 = new char[str2.length()];
		for (int i = 0; i < str1.length(); i++) {
			c1[i] = str1.charAt(i);
		}
		for (int i = 0; i < str2.length(); i++) {
			c2[i] = str2.charAt(i);
		}
		for (int i = 0; i < str1.length(); i++) {
			permo = false;
			for (int j = 0; j < str2.length(); j++) {
				if (c1[i] == c2[j]) {
					permo = true;
					break;
				}

			}
		}
		if (str1.length() != str2.length())
			permo = false;
		System.out.println(permo);
		*/
	}
}