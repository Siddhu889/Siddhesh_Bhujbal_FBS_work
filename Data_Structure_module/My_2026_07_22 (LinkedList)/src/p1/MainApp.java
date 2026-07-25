package p1;

import java.util.LinkedList;

public class MainApp {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.size());
        
        System.out.println(ll.contains(3));
        System.out.println(ll.contains(10));
    }

}