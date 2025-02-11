package yaip4;

public class Mammal extends Animal {
	public Mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal["+ super.toString()+"]";
	}
	
	public static void main(String[] args) {
		Mammal M = new Mammal("Elephant");
		System.out.println(M);
	}
}
