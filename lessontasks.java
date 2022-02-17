package firstpackage;

import java.util.Arrays;

public class lessontasks {
public static void main(String[] args) {
/*double x = Double.MAX_VALUE;
double y = Double.MIN_VALUE;
double z = Double.MIN_NORMAL;
System.out.println("min double is "+ y +
		"\n min normal is "+ z+ 
		"\n max double is "+ x);
*******************************************
int a = MyConsole.readInt("get a");
int b = MyConsole.readInt("get b");
System.out.println("A= "+ a + "\n B= "+ b);
int temp =a;
a=b;
b=temp;
System.out.println("after the opposting A= "+ a + "\n B= "+ temp);

	for (int i=0, j=20; i<10; i=i+2, j=j-1){
		System.out.println(" i="+i+" j= "+j);
	}
*/
	int arr[]={1,2,3,4,5,6,7,8,9,10};
	for(int i =0;i<arr.length;i++) {
		arr[i]=((int)(Math.random()*10));
	}
	System.out.println("the array numbers are: " + Arrays.toString(arr));
	int sum=0;
	for(int j=0;j<arr.length;j++) {
		sum+=arr[j];
	}
	System.out.println("the sum of the numbers of the array is: " + sum);
	double avg=(double)(sum/arr.length);
	System.out.println("the avarge of the numbers in our array is: " + avg);
}	
}
