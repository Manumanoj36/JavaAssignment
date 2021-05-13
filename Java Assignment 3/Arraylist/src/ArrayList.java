import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> n=new ArrayList<>();
		

		n.add("pizza");
		n.add("sandwitch");
		n.add("lays");
		n.add("fries");
		n.add(3);
		
		System.out.println(n);
		
		ListIterator<Object>  l= n.listIterator(n.size());
		
		while(l.hasPrevious())
		{
			Object s=l.previous();
			System.out.println(s);
				}
	}
}
