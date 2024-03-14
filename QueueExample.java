package collectionslist;
import java.util.*;


public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> qu=new LinkedList<Integer>();
		for(int i=1;i<=5;i++) {
			qu.addLast(i);
		}
		System.out.println("Queue now: "+qu);
		System.out.println("Front removed: "+qu.remove());
		System.out.println("Queue now : "+qu);
		System.out.println("Head of queue: "+qu.peek());
		qu.addLast(6);
		System.out.println("Size of queue: "+qu.size());
	}

}
