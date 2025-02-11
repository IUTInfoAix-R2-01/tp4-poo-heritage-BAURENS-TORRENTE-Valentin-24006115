package yaip6;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void greets() {
		System.out.println("woof");
	}
	
	public void greets(Dog another) {
		System.out.println("woooof");
	}
}
