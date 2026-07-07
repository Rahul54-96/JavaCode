package assignments;

import java.util.*;

public class A97_DemonstrateLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();

	    list.add("A");
	    list.add("B");
        list.add("C");
        System.out.println("After add: " + list);

        System.out.println("get(1): " + list.get(1));

        list.addFirst("First");
        list.addLast("Last");
        System.out.println("After addFirst/addLast: " + list);

        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());

        String rf = list.removeFirst();
        String rl = list.removeLast();
        System.out.println("Removed first: " + rf + ", removed last: " + rl);
        System.out.println("List now: " + list);

        boolean offered = list.offer("Offered");
        System.out.println("offer(\"Offered\") returned: " + offered);
        System.out.println("After offer: " + list);

        String peeked = list.peek();
        System.out.println("peek(): " + peeked + " (does not remove)");

        String polled = list.poll();
        System.out.println("poll(): " + polled + " (removes head)");
        System.out.println("Final list: " + list);
        }
	}