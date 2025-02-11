package yaip4;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student ["+ super.toString() +", program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	public static void main(String[] args) {
		Student S = new Student("Pablo", "rue de quelque chose", "Math", 2026, 5036.99);
		
		S.setProgram("Geographie");
		System.out.println(S.getProgram());
		S.setYear(2025);
		System.out.println(S.getYear());
		S.setFee(69.42);
		System.out.println(S.getFee());
		System.out.println(S);
	}
	
	
}
