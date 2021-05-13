
public class PersistanceTest {

	public static void main(String[] args) {
		FilePersistancee p = new FilePersistancee();
		p.persist();
		Persistance p1 = new DatabasePersistance();
		p1.persist();
		

	}

}