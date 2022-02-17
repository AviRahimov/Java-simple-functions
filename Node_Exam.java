package firstpackage;

public class Node_Exam {
	private int data;
	private Node_Exam next;

	public Node_Exam(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node_Exam getNext() {
		return next;
	}

	public void setNext(Node_Exam next) {
		this.next = next;
	}
}
