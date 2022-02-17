package firstpackage;

public class DynamicList {
private Node head;
private Node tail;
private int size;
public int getSize() {
	return size; 
}
public void add(Person p) {
	Node n = new Node(p);
	if(head == null) {
		head = n;
		tail = n;
	}
	else {
		tail.setNext(n);
		n.setPrev(tail);
		tail = n;
	}
	size++;
}
public String toString() {
	String ans = "";
	Node curr = head;
	while(curr!=null) {
		ans+= curr.toString() + " ";
		curr = curr.getNext();
	}
	return ans;
}
public void remove(Person p) {
	Node node = search(p);
	if(node == head && node == tail) {
		head = null;
		tail = null;
	}
	else if(node == head) {
		head = head.getNext();
		head.setPrev(null);
	}
	else if(node == tail) {
		tail = tail.getPrev();
		tail.setNext(null);
	}
	else {
		node.getPrev().setNext(node.getNext());
		node.getNext().setPrev(node.getPrev());
	}
	size--;	
}
private Node search(Person p) {
Node curr = head;
while(curr != null) {
	if(p.getName() == curr.getPerson().getName() && p.getId() == curr.getPerson().getId())
		return curr;
	curr = curr.getNext();
}
return null;
}







}
