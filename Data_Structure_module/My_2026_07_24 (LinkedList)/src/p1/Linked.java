package p1;

//import p1.Linked.Node;

//import java.util.LinkedList;

public class Linked {
      
	class Node{
		int data;
		Node next;
		Node head;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node head;
	int size;
	Node tail;
	
	//Reverse Linked List
	public void reverse()
	{
		Node prev = null;
		Node curr = tail = head;
		Node next;
		
		while(curr != null)
		{
			next  = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	//find and remove Nth node from end
	public void deleteNthfromEnd(int n)
	{
		int sz = 0;
		Node temp = head;
		while(temp != null)
		{
			temp = temp.next;
			sz++;
		}
		
		if(n == sz)
		{
			head = head.next;//remove first
			return;
		}
		
		//sz-n
		int i = 1;
		int iToFind = sz-n;
		Node prev = head;
		While(i < iTofind)
		{
			prev = prev.next;
			i++;
		}
		
		prev.next = prev.next.next;
		return;
	}
	
	//Detect a loop/Cycle in a LL
}