package firstpackage;

public class Node {
private Person p;
private Node next = null;
private Node prev = null;
public Node(Person p) {
	this.p = new Person(p);
}
public Person getPerson() {
	return this.p;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	 this.next = next;
}
public Node getPrev() {
	return prev;
}
public void setPrev(Node prev) {
	this.prev = prev;
}
public String toString() {
	return this.p.toString();
}




}

