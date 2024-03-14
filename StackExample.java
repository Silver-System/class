package collectionslist;

import java.util.LinkedList;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> st=new LinkedList<Integer>();
		for(int i=1;i<=5;i++) {
			st.addFirst(i);
		}
		System.out.println("Stack now: "+st);
		System.out.println("Top removed: "+st.remove());
		System.out.println("Stack now : "+st);
		System.out.println("Head of Stack: "+st.peek());
		st.addFirst(6);
		System.out.println("Stack now: "+st);
		System.out.println("Size of Stack: "+st.size());

	}

}
