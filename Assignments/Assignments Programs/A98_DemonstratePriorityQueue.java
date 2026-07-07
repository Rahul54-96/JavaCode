package assignments;

import java.util.*;

public class A98_DemonstratePriorityQueue 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.offer(10);
        pq.add(20);
        pq.offer(40);
        System.out.println("PriorityQueue after adds/offers: " + pq);

        System.out.println("peek(): " + pq.peek());
        System.out.println("element(): " + pq.element());

        System.out.print("Elements using iterator (order not guaranteed): ");
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) 
        {
            System.out.print(it.next() + " ");
        }
	        System.out.println();

        System.out.println("contains(20): " + pq.contains(20));
        System.out.println("size(): " + pq.size());

        System.out.println("poll() -> removes head: " + pq.poll());
        System.out.println("remove(20) -> " + pq.remove(20));
        System.out.println("After poll & remove: " + pq);

        pq.clear();
        System.out.println("After clear, isEmpty(): " + pq.isEmpty());
        }
}