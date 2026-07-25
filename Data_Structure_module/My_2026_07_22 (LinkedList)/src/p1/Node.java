package p1;

public class Node {

    int data;
    Node next;
    int size;
    int tail;
    
    public Node() {
		// TODO Auto-generated constructor stub
	}
    
	public Node(int data, Node next, int size, int tail) {
		this.data = data;
		this.next = next;
		this.size = size;
		this.tail = tail;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

   
}