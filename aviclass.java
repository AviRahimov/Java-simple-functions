package firstpackage;

import java.util.Arrays;

public class aviclass {
	public static int min(int x, int y) {
		return x < y ? x : y;// if x<y so return x else return y, ? means if and then "true" : "false"
	}

	public static void main(String[] args) {
//		Person p = new Person(136, "hi");// local variable
//		p.setId(123);
//		p.setName("avi");
//		System.out.println(p.id);
//		System.out.println(p.getName());
//		Person p1 = new Person(p);
//		System.out.println("p1 =" + p1);
//		Course c = new Course(6,1,"infi");
//		Course c2 = new Course(5,2,"logic");
////		c.setName("torata");
////		System.out.println(c);
//		Student s = new Student("Avi",12312313);
//		Student numCourse = new Student(2);
//		numCourse.addCourse(c);
//		numCourse.addCourse(c2);
//		System.out.println(numCourse);
//		Course java = new Course(5, 100, "Java");
//		Course infi = new Course(5, 200, "Infi");
//		Course algebra = new Course(5, 333, "Algebra");
//		Course java2 = new Course(java);
//		java.setName("ahla java");;
//		System.out.println("java = " + java);
//		System.out.println("java2 = " + java2);
//		Student dana = new Student("Dana", 123456);
//		dana.addCourse(java);
//		dana.addCourse(infi);
//		dana.addCourse(algebra);
//		
//		dana.updateGrade(100, 100);
//		dana.updateGrade(333, 88);
//		
//		System.out.println(dana);
//		System.out.println(dana.avg());
//		DynamicList l = new DynamicList();
//		Person p = new Person(123, "avi");
//		Person p2 = new Person(4234, "dani");
//		Person p3 = new Person(865, "ahla");
//		l.add(p);
//		l.add(p2);
//		l.add(p3);
//		l.remove(p2);
//		System.out.println(l);
		int [] arr = {9,14,3,2,43,11,58,22};
		tirgul.SelectionSort(arr);
		
		/*
		 * String st1 = ""; char ch; String st =""; int x
		 * =MyConsole.readInt("Write a decimal number:"); while(x!=0){ st =st + "" + x%2
		 * + ""; x = x/2; } for(int i =0;i<st.length();i++) { ch = st.charAt(i); st1 =
		 * ch+st1; } System.out.println("The binary number for your decimal number is:"
		 * + st1);
		 *********************************************************************************
		 *//*
			 * String str = "*"; int x =MyConsole.readInt("Write the number of the side: ");
			 * for(int i =0; i<x;i++) { for(int j=0; j<=i; j++) { System.out.print(str);
			 * 
			 * } System.out.println(); }
			 */
		/*
		 * String str = "*"; int x =
		 * MyConsole.readInt("Write the number of the side: "); for (int i = x; i > 0;
		 * i--) { for (int j = i; j < x; j++) { System.out.print(" "); } for (int k = 0;
		 * k < i; k++) { System.out.print(str); } System.out.println(); }
		 */
	//String:
		/*
		 * String [] str1 = str.split(""); String [] str2 = new String[str1.length];
		 * boolean is_true= false; int counter = 0; for (int i = str1.length-1; i>=0;
		 * i--) { str2[counter]=str1[i]; counter++; } for (int i = 0; i < str2.length;
		 * i++) { if(str1[i].equals(str2[i])) { is_true=true; } else is_true=false; }
		 * System.out.println(is_true);
		 */
	//	int count = 0;
		//for (int i = 0; i < str.length(); i++) {
			//if (str.charAt(0) == str.charAt(i)) {
				//count++;
		//	}
	//	}
		//System.out.println("The number of times that '" + str.charAt(0) + "' appears is " + count);

	}
}
