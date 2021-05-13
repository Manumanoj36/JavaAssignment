import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String {

	public static void main(java.lang.String[] args) {
		StringBuilder str = new StringBuilder();
		List<String> l1= new ArrayList<>(Arrays.asList("Abc","Bcd","Cde","Def","mno","Pqr"));
		l1.forEach(word -> str.append(word.charAt(0)));
		System.out.println(str);
	}
	}
	
	
