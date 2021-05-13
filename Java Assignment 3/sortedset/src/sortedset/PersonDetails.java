package sortedset;

public class PersonDetails  implements Comparable {
	int Weight;
	int Height;
	String name;

	PersonDetails(int Weight, int Height, String name) {
		this.Height = Height;
		this.Weight = Weight;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [Weight=" + Weight + ", Height=" + Height + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		int Weight1 = this.Weight;
		int Height1 = this.Height;
		PersonDetails p = (PersonDetails) o;
		int Weight2 = p.Weight;
		int Height2 = p.Height;
		if (Weight1 < Weight2) {
			return -1;
		} else if (Weight1 > Weight2) {
			return +1;
		} else {
			if (Height1 < Height2) {

				return -1;
			} else if (Height1 > Height2) {
				return 1;
			}

		}
		return Height2;

	}
}
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails p1 = new PersonDetails(59, 5, "Hulk");
		PersonDetails p2 = new PersonDetails(66, 7, "Spidy");
		PersonDetails p3 = new PersonDetails(45, 8, "Thor");
		PersonDetails p4 = new PersonDetails(45, 6, "Tom");
		PersonDetails p5 = new PersonDetails(45, 4, "Jerry");

		TreeSet<PersonDetails> n = new TreeSet<>();
		n.add(p1);
		n.add(p2);
		n.add(p3);
		n.add(p4);
		n.add(p5);
		System.out.println(n);
	}

}



