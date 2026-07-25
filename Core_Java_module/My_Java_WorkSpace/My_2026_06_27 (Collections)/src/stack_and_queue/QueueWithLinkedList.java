package stack_and_queue;

import java.util.LinkedList;

public class QueueWithLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList <Integer> l1 = new LinkedList <Integer>();
        
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(30);
        
        l1.removeFirst();
        l1.removeFirst();
        l1.removeFirst();
	}

}
