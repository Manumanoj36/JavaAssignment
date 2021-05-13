
import java.util.function.Predicate;
public class PredicateExample {
	public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18); 
  
        // Calling Predicate method
        System.out.println(lesserthan.test(54)); 
    }

}
