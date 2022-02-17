package firstpackage;

public class Student {
	private String name;
	private long id;
	private Course[] courses = new Course[2];
	private int counter = 0;

	public Student(String name, long id) {
		this.name = name;
		this.id = id;
	}

//	public Student(int size) {
//    courses = new Course[size];	
//	}
	public void resize() {
		if (counter == courses.length) {
			Course[] temp = new Course[2 * courses.length];
			for (int i = 0; i < counter; i++) {
				temp[i] = courses[i];
			}
			courses = temp;
		}
	}

	public void addCourse(Course another) {
		resize();
		courses[counter++] = new Course(another);
	}

	public String toString(Course[] c) {
		String res = "";
		for (int i = 0; i < c.length; i++) {
			res += c[i];
		}
		return res;
	}

	public boolean updateGrade(int courseCode, int grade) {
		boolean isExist = false;
		if (grade > 100 || grade < 0)
			return isExist;
		for (int i = 0; i < counter; i++) {
			if (courses[i].getNum() == courseCode) {
				isExist = true;
				courses[i].setGrade(grade);
				break;
			} else
				isExist = false;
		}
		return isExist;
	}

	public double avg() {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < counter; i++) {
			if (courses[i].getGrade() != 0) {
				sum += courses[i].getGrade();
				count++;
			}
		}
		if (count == 0)
			return 0;
		return sum / count;
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < counter; i++) {
			res += "\n" + courses[i];
		}
		return "Courses: " + res + "\nName: " + this.name + "\nID: " + this.id;
	}
}
