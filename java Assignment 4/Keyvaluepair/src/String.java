import java.util.HashMap;
import java.util.Map;

public class String {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("Manu", 1);
		m.put("swetha",2);
		m.put("chai",3);
		
		StringBuilder s = new StringBuilder();
		m.entrySet().forEach(n -> s.append(n.getKey()).append(n.getValue()));
		System.out.println(s.toString());
		
	}

}
