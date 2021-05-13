import java.util.ArrayList;
import java.util.List;

public class odd {
	public static void main(String[] args) {
		List<String> ls= new ArrayList<>();
		ls.add("chai");
		ls.add("swetha");
		ls.add("chaithanya");
		ls.add("manoj");
		ls.add("swe");
		ls.add("manu");
		
		ls.forEach(i -> {  
            if (i.length() % 2 == 0) {  
                System.out.println(i); 
            }  
        });  
    }  
} 