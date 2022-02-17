package firstpackage;

public class Person {
	private int id;// global variable usually as private
	private String name;// global variable

	public Person(int id2, String name2) {
		id = id2;// == this.id = id
		name = name2;// == this.name = name
	}

	public Person(Person p) {
		//this.id = p.getId();
		//this.name = p.getName();
		this(p.getId(), p.getName());//better instead the previous
	}
	public String toString() {
		return "Person [id=" + this.id + ", name=" + this.name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String NewName) {
		this.name = NewName;
	}

}