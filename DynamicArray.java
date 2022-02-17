package firstpackage;

public class DynamicArray {
	private Person[] persons;
	private int counter = 0;

	public DynamicArray(int startSize) {
		persons = new Person[startSize];
	}
	public void add(Person p) {
		rescale();
        persons[counter++] = new Person(p);
	}
    private void rescale() {
    	if(counter == persons.length) {
    		Person [] temp = new Person[2*persons.length];
    		for (int i = 0; i < persons.length; i++) {
				temp[i] = persons[i];
			}
    		persons = temp;
    	}
    }
    public String toString() {			
    	String res = "";
    	for (int i = 0; i < counter; i++) {
			res+=persons[i].toString();
		}
    	return res;
    }
}
