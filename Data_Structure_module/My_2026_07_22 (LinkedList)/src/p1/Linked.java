package p1;

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
	
	public void print()
	{
		if(head == null)
		{
			System.out.println("LL is empty");
			return;
		}
		
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public int removeFirst()
	{
		if(size == 0)
		{
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}
		else if(size == 1)
		{
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	
	public int removeLast()
	{
		if(size == 0)
		{
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}
		else if(size == 1)
		{
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		
		//previous node
		Node prev = head;
		for(int i=0; i<size-2; i++)
		{
			prev = prev.next;
		}
		
		int val = prev.next.data;//tail.data
		prev.next = null;
		tail = prev;
		size--;
		return val;
		
	}
	
	public int itrSearch(int key)
	{
		Node temp = head;
		int i = 0;
		
		while(temp != null)
		{
			if(temp.data == key)
			{//key found
				return i;
			}
			temp = temp.next;
			i++;
		}
		//key not found
		return -1;
	}
}