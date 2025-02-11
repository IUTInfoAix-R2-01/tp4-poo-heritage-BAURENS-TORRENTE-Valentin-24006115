package yaip6;

public abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	abstract public void greets();
	
}
