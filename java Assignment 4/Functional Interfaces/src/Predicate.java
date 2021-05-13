
	@FunctionalInterface
	interface Predicat<String>{
	    boolean test(String p);
	}
	public class Predicate {
	    public static void main(String[] args){
	    java.util.function.Predicate<String> pfunc= p->p.length()>5;
	    System.out.println("Predicate Outputs:");
	    System.out.println(pfunc.test("Preveen"));
	    System.out.println(pfunc.test("Anu"));
	}}
