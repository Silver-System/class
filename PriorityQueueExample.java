package Collection_framework;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(3);
		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(4);
		System.out.println("Priority Queue: "+pq);
		System.out.println("Head: "+pq.element());
		System.out.println("Head: "+pq.peek());
		System.out.println();
		pq.poll();
		pq.remove();
		Iterator<Integer> itr=pq.iterator();
		System.out.println("Iterating the PQ: ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		//pq.clear();
		System.out.println();
		System.out.println("Is PQ empty? "+pq.isEmpty());
		System.out.println("Contains 3? "+pq.contains(3));
		
		
		
	}

}
