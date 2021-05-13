import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class String1 {
	public static void main(String[] args){
        Map<Integer, String> m=new HashMap<Integer, String>();
        m.put(1,"manu");
        m.put(2,"swetha");
        m.put(3,"chai");
        List<String> list=new ArrayList<String>(m.values());
        List<Integer> list1=new ArrayList<Integer>(m.keySet());
        StringBuilder sb=new StringBuilder();
        for(String s:list){
            sb.append(s);
        }
        for(Integer s1:list1){
            sb.append(s1);
        }
        System.out.println(sb.toString());
    }
}

