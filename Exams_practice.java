package firstpackage;

import java.util.Arrays;
import java.util.Iterator;

public class Exams_practice {
	public static boolean MarsennePrime(int n) {
		boolean two_square = false;
		boolean prime_marsen = true;
		for (int j = 2; j < n; j++) {
			if (n % j == 0)
				prime_marsen = false;
		}
		for (int i = 0; i < n && prime_marsen; i++) {
			if (n == (Math.pow(2, i) - 1))
				two_square = true;
		}
		return two_square;
	}

// 2020 semester A:
	public static boolean powerful(int n) {
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < n; j++) {
				if (i % j == 0 && i != j) {
					prime = false;
					break;
				} else
					prime = true;
			}
			if (prime == true) {
				if (n % (i * i) == 0) {
					break;
				}
			}

		}
		return prime;
	}

	public static void spiral(int[][] a) {
		for (int i = 0; i <= a.length - i; i++) {
			for (int k = i; k < a.length - i-1; k++) {
				System.out.println(a[i][k]);
			}
			for (int j = i; j < a.length - i-1; j++) {
				System.out.println(a[j][a.length - i - 1]);
			}
			for (int j2 = a.length - i - 1; j2 > i; j2--) {
				System.out.println(a[a.length - i - 1][j2]);
			}
			for (int j3 = a.length - i - 1; j3 > i; j3--) {
				System.out.println(a[j3][i]);
			}
		}

	}

	public static int balanced(String s) {
		// char S,R;
		int countS = 0, countR = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'S')
				countS++;
			else if (s.charAt(i) == 'R')
				countR++;
		}
		if ((countS != 0 && countR == 0) || (countR != 0 && countS == 0))
			return 1;
		else if (countS == countR)
			return countS;
		else
			return Math.min(countS, countR);
	}

//2020 semester A moed B, Q1
	public static boolean prime(int n) {
		boolean prime = false;
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			} else
				prime = true;
		}
		return prime;
	}
	public static boolean semi(int n) {
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			if (prime(i)) {
				for (int k = i; k < n; k++) {
					if (prime(k) && k * i == n) {
						flag = true;
						break;
					}
				}
			}
			if (flag == true)
				break;
		}
		return flag;
	}
// 2020 Semester A moed B Q2
//	public static int findMaxNum(String str) {
//	
//	}
// 2020 Semester A moed B Q3
	public static boolean diagonal(int [][] a) {
		boolean flag = true;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a[0].length-1	; j++) {
				if(a[i][j]!=a[i+1][j+1]) {
					flag = false;
					break;
				}
			}
			if(flag == false)
				break;
		}
		return flag;
	}
// 2020 Semester A moed B Q5
	public static Node_Exam cycle(Node_Exam p) {
		Node_Exam temp = p.getNext();
		while(temp!= null) {
			Node_Exam temp2 = p;
			while(temp2!=temp) {
				if(temp.getNext()==temp2) {
					System.out.println(temp2.getData());
					return temp2;
				}
				else
					temp2 = temp2.getNext();
			}
			temp = temp.getNext();
		}
		System.out.println("null");
		return null;
	}
// Targuk mesakem Drive
	public static int [] marr(int n) {
		int [] arr = new int[n];
		for (int i = 1; i <=arr.length; i++) {
			arr[i-1] = (int)(Math.random()*i);
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		functions_Exams.printarr(arr);
		return arr;
		}
//2019 semester B moed A
		public static long sortDigits(long num) {// 60504
			String Snum = String.valueOf(num);// Snum = "60504"
			char[] arr1 = new char[Snum.length()];// length = 5
			int count = 0;
			for (int i = 0; i < Snum.length(); i++) {
				if (Snum.charAt(i) != '0') {
					arr1[count] = Snum.charAt(i);// ['6','5','4','-1','-1']
					count++;
				}
			}
			String Sarr = "";// "654-1-1"
			for (int i = 0; i < arr1.length; i++) {
				Sarr += arr1[i];
			}
			int[] arr = new int[Sarr.length()];// [6,5,4,-1,-1]
			for (int i = 0; i < arr.length; i++) {
				char c = Sarr.charAt(i);// i=0:'6', i=1,c='5'
				arr[i] = Character.getNumericValue(c);
			}
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			} // [-1,-1,4,5,6]
			String str = "";//"456"
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 0 && arr[i] <= 9)
					str += String.valueOf(arr[i]);
			}
			
			long sorted = Long.parseLong(str);//456
			return sorted;
		}
//2019 semester B moed A
		public static long sortDigits2(long num) {//60504
			int count = 0;//3
			long counter = num;//counter = 60504
			while(counter!=0) {
				if(counter%10!=0)
					count++;
				counter = counter/10;
			}
			int [] arr = new int[count];//[4,5,6]
			int i = 0;
			while(num!=0) {
				if(num%10!=0) {
					arr[i] = (int)num%10;
					i++;
				}
				num = num/10;
			}
			for (int k = 0; k < arr.length - 1; k++) {
				for (int j = 0; j < arr.length - 1 - k; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			long l = 0;
			int mult = 10;
			for (int j = arr.length-1; j >=0; j--) {//[4,5,6]
				l+=arr[j]*mult;//60+500+4000
				mult*=10;
			}
			return l/10;
		}
//2018 semester A moed B
		public static boolean crossword(char[][]a, String s) {
			int count = 0;
			boolean flag = false;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j <= a[0].length-s.length(); j++) {
					count = 0;
					flag = true;
					for (int k = j; k < s.length()+j; k++) {
						if(a[i][k]!=s.charAt(count)) {
							flag = false;
							break;
						}
						count++;
					}
					if(flag == true)
						return true;
				}
			}
			for (int j = 0; j < a[0].length; j++) {
				for (int i = a.length; i > a.length-s.length(); i--) {
					count = 0;
					flag = true;
					for (int k = i-1; k >= i-s.length(); k--) {
						if(a[k][j]!=s.charAt(count)) {
							flag = false;
							break;
						}
						count++;
					}
					if(flag == true)
						return true;
				}
			}
			return false;
		}
//2019 semester A moed B
		public static int calcSumDiag(int [][]arr) {
			return Ezer(arr,0,0);
		}

		public static int Ezer(int[][]arr,int i , int j) {
			if(i == arr.length && j == arr[0].length)
				return 0;

		        return arr[i][j] + Ezer(arr,i+1,j+1);
		}
//mivhan ledugma Q2: teacher answer(mine is after it)
		public static String longestWord(String s) {
			String answer = "";
			int start=0;
			for(int i=0; i<s.length(); i++) {
				if (s.charAt(i) == ' ') 
					start=i+1;//3
				else {
					int length = i-start+1;
					if(length > answer.length()) {
						answer =  s.substring(start,length);
					}
				}
			}
			return answer;
		}
//My answer to previous question
		public static String longestword(String s) {
			String [] words = new String[s.length()];
			int index = 0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == ' ') {
					words[i] = s.substring(index, i);
							index = i+1;
				}
				if(i==s.length()-1)
					words[i] = s.substring(index, s.length());
			}
			String max = "";
			for (int i = 0; i < words.length; i++) {
				if(words[i]==null)
					continue;
				else if(words[i].length()>max.length())
					    max = words[i];
			}
			return max;
		}

		public static boolean isSymmetricX(String str, int x) {
			if (x == 0)
				return true;
			isSymmetricX(str, x - 1);
			return str.charAt(x - 1) == str.charAt(str.length() - x);
		}
		public static void switchdiags(int [][] arr) {
			for (int i = 0; i < arr.length; i++) {
				//swapArr(arr,arr[i][i],arr[i][arr.length-1-i]);
				swapArr(arr,i,arr.length-1-i);
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(Arrays.toString(arr[i]));
			}
			
		}
		public static void swapArr(int[][]arr,int i, int j) {
			int temp = arr[i][i];
			arr[i][i] = arr[i][j];
			arr[i][j] = temp;
		}

//Avihai Question
		public static boolean horizontal(int[][] a) {
			int sumupper = 0;
			int sumlower = 0;
			boolean horizon = true;
			if (a.length % 2 != 0) {
				return false;
			} else {
				for (int i = 0; i < a.length; i++) {
					sumupper = 0;
					sumlower = 0;
					for (int j = 0; j < a.length / 2; j++) {
						sumupper += a[j][i];
					}
					for (int k = a.length / 2; k < a.length; k++) {
						sumlower += a[k][i];
					}
					if (sumlower != sumupper) {
						horizon = false;
					    break;
					}
				}

			}

			return horizon;
		}
		public static boolean horizontal1 (int [][]a) {
			int sumupper = 0;
			int sumlower = 0;
			boolean horizon = true;
			if(a.length%2!=0) {
				return false;
			}
			else {
			for(int i=0;i<a.length;i++) {			
				for(int j = 0 ; j < a.length/2 ; j++) {
					sumupper+=a[j][i];			
				}
				for(int k = (a[0].length)/2 ;k < a.length ; k++) {						
						sumlower+=a[k][i];
					}			
			}
				if(sumupper!=sumlower) {
					horizon = false;
				}
			}
		
			return horizon;
			}
//2022 semester A moed B
			public static int plus(String s) {// "123+321" = 123 + 321 = 444
				int sum = 0;
				int index = 0;
				for (int i = 0; i < s.length(); i++) {
					if(s.charAt(i)== '+' || s.charAt(i)== '-') {
						sum+=Integer.parseInt(s.substring(index, i));
								index = i;
					}
					if(i==s.length()-1)
						sum+=Integer.parseInt(s.substring(index, i+1));
				}
				return sum;
			}
	public static void main(String[] args) {
		// System.out.println(powerful(15));
	int  [][] mat ={{1, 2, 3, 4},
			        {12,13,14,5},
			        {11,16,15,6},
			        {10,9,8,7}};
	//spiral(mat);
		// String s = "RRSSRS";
		// System.out.println(balanced(s));
		// System.out.println(Math.pow(3, 2));
//		String str = "&*ab1234crt70";
		//isContain("hello","lo");
//		int [][] a = {{1,2,3,4,7}, {5,1,2,3,4}, {9,5,1,2,3}};
//		System.out.println(diagonal(a));
//		Node_Exam e = new Node_Exam(2);
//		Node_Exam e1 = new Node_Exam(3);
//		Node_Exam e2 = new Node_Exam(100);
//		Node_Exam e3 = new Node_Exam(9);
//		Node_Exam e4 = new Node_Exam(-30);
//		Node_Exam e5 = new Node_Exam(11);
//		Node_Exam e6 = new Node_Exam(5);
//		Node_Exam e7 = new Node_Exam(3);
//		e.setNext(e1);
//		e1.setNext(e2);
//		e2.setNext(e3);
//		e3.setNext(e4);
//		e4.setNext(e5);
//		e5.setNext(e6);
//		e6.setNext(e7);
//		e7.setNext(null);
		//cycle(e);
		//marr(20);
		//System.out.println(sortDigits2(0));
//		char [][] a = {{'a','w','x','r','e'},
//		               {'f','y','e','s','h'},
//		               {'h','y','y','e','a'},
//		               {'a','a','h','t','r'},
//		               {'a','v','i','h','i'}};
//		System.out.println(crossword(a,"ira"));
        int [][] a = {{1,2,3,4,5},
		              {3,2,1,6,9},
		              {8,9,6,5,0},
		              {0,1,4,2,3},
		              {4,2,1,4,5}};
		//System.out.println(calcSumDiag(a)); 
		//String s = "24.5";
		//System.out.println(longestWord(s));
		//System.out.println(longestword(s));
		//System.out.println(isSymmetricX(s,2));
		//switchdiags(a);
		//System.out.println(Character.getNumericValue(s.charAt(0))==2);
        int arr[][] = {{7,10,8,4},
		       	       {2,-3,0,4},
		       	       {4,1,2,4},
		       	       {5,6,6,4}};
        
        int arr1[][] = {{7,10,8,4},
	       	            {2,-3,0,4},
	       	            {3,1,2,4},
	       	            {5,6,6,4}};
        //System.out.println(horizontal(arr));
       // System.out.println(horizontal(arr1));
        //System.out.println(stairs(5));
        System.out.println(plus("14-35+30-4380+483+3+2-4322+0-0"));
        //System.out.println(15 + Integer.parseInt("-15"));
		}
		}
		