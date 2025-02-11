package yaip4;

public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal[name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Animal A = new Animal("Tigre");
		System.out.println(A);
	}
}
