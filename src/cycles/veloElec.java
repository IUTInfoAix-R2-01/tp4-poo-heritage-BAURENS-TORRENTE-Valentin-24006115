package cycles;

public class veloElec extends velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public veloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public veloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public veloElec() {
	}
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	public double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	@Override
	public String toString() {
		return "veloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	@Override
	public double getPuissance(double frequenceCoupDePedale) {
		return super.getPuissance(frequenceCoupDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		veloElec v1 = new veloElec();
		veloElec v2 = new veloElec(15.0, 3.2);
		veloElec v3 = new veloElec(4.2, 15.0, 4.0);
		System.out.println("Mon premier velo elec a un braquet de " + v1);
		System.out.println("Mon deuxieme velo elec a un braquet de " + v2);
		System.out.println("Mon troisieme velo elec a un braquet et un diametre de roue de " + v3);
		
		v1.setFacteurPuissanceMoteur(3.0);
		System.out.println(v1.getFacteurPuissanceMoteur());
		System.out.println(v3.getPuissance(2.0));
	}
	
}
