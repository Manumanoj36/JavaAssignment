import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<String>();
		h.add("S");
		h.add("H");
		h.add("2");
		h.add("A");
		
		System.out.println("hash set output which is unorderd "+h);
		
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		l.add("S");
		l.add("A");
		l.add("2");
		l.add("N");
		
		System.out.println("hash set output which is orderd "+l);
		
		
		
	}


	}


