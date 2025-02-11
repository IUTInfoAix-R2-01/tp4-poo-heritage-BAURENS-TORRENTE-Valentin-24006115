package cycles;
import java.util.Random;
public class velo {
	private final double DEFAULT_BRACKET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	public velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	public velo(double braquet) {
		this.braquet = braquet;
	}
	public velo() {
	}
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	public double getDEFAULT_BRACKET() {
		return DEFAULT_BRACKET;
	}
	public String toString() {
		return "velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	public double getPuissance(double FrequenceCoupDePedale) {
		return FrequenceCoupDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		velo v1 = new velo();
		velo v2 = new velo(15);
		velo v3 = new velo(15, 4);
		System.out.println("Mon premier velo a un braquet de " + v1);
		System.out.println("Mon deuxieme velo a un braquet de " + v2);
		System.out.println("Mon troisieme velo a un braquet et un diametre de roue de " + v3);
		
		v1.setBraquet(10.2);
		System.out.println(v1.getBraquet());
		v1.setDiamRoue(2.0);
		System.out.println(v1.getDiamRoue());
		System.out.println(v1.getPuissance(2.0));
	}
	
	
}
