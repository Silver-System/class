package collectionslist;
import java.util.*;
public class Arraylistsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(34);
		al.add(2);
		al.add(43);
		al.add(-4);
		System.out.println("Before Sort :"+al);
		al.sort(null);
		//Collections.sort(al);
		System.out.println("After Sort: "+al);
		Collections.sort(al,Collections.reverseOrder());
		//Collections.reverse(al);
		System.out.println(al);

	}

}
