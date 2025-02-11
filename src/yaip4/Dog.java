package yaip4;

public class Dog extends Mammal{

	public Dog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog other) {
		System.out.println("Woooof");
	}
	@Override
	public String toString() {
		return "Dog["+super.toString()+"]";
	}
	public static void main(String[] args) {
		Dog D = new Dog("Doggy");
		Dog D1 = new Dog("Doggy?");
		System.out.println(D);
		D.greets();
		D.greets(D1);
	}
	
}
