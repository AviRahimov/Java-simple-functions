package firstpackage;

public class Course {
	private int num, credits, grade;
	private String name;

	public Course(int credits, int num, String name) {
		this.credits = credits;
		this.num = num;
		setName(name);
	}

	public Course(Course c) {
		this(c.getCredits(), c.getNum(), c.getName());
	}

	public String getName() {
		return this.name;
	}

	public int getCredits() {
		return this.credits;
	}

	public int getNum() {
		return this.num;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setName(String s) {
		this.name = s;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String toString() {
		return "name: " + this.name + " ,num: " + num + " ,grade: " + grade + " ,credits: " + credits;
	}

}
