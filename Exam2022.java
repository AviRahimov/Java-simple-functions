package firstpackage;

import java.util.Arrays;

public class Exam2022 {
	public static boolean absolute(int n) {//a*100+b*10+c*1
		int a = n/100;//meot
		int b = (n/10)%10;//asarot
		int c = n%10;//ahadot
		int n1 = a*100 + b*1 + c*10;
		int n2 = a*10 + b*1 + c*100;
		int n3 = a*10 + b*100 + c*1;
		int n4 = a*1 + b*10 + c*100;
		int n5 = a*1 + b*100 + c*10;
		if(prime(n) && prime(n1) && prime(n2) && prime(n3) && prime(n4) && prime(n5))
			return true;
		return false;
	}
	public static boolean prime(int n) {
		for (int i = 2; i < n; i++) {
			if(n%i==0)
					return false;
		}
		return true;
	}
	//{-2,-5,1,3,8,6,7} -> {-2,1,3,8}
	public static int [] big(int [] arr) {
		int pass = arr[0];
        int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > pass) {
				pass = arr[i];
				count++;
			}
		}
		int [] bigarr = new int[count];
		count = 1;
		pass = arr[0];
		bigarr[0] = pass;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > pass) {
				pass = arr[i];
				bigarr[count] = pass;
				count++;
			}
		}
		System.out.println(Arrays.toString(bigarr));
		return bigarr;
	}
	public static void main(String args[]) {
		//System.out.println(absolute());
		int [] arr = {-5,-3,4,12,1,9,6};
		big(arr);
	}
}
