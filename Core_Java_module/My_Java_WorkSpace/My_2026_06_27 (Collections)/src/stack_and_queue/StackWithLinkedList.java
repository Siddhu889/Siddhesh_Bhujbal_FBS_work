package stack_and_queue;

import java.util.LinkedList;

public class StackWithLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList <Integer> l1 = new LinkedList <Integer> ();
         
         l1.addFirst(10);
         l1.addFirst(20);
         l1.addFirst(30);
         
         l1.removeFirst();
         l1.removeFirst();
         l1.removeFirst();
	}

}
