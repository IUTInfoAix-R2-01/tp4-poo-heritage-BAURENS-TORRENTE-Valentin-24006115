package yaip7;

public class DiscountRate {
	private static double serviceDiscountPrenium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPrenium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate (String type) {
		if (type == "Prenium") {
			return serviceDiscountPrenium;
		}
		else if (type == "Gold") {
			return serviceDiscountGold;
		}
		else if (type == "Silver") {
			return serviceDiscountSilver;
		}
		return 0;
	}
	
	public static double getProductDiscountRate (String type) {
		if (type == "Prenium") {
			return productDiscountPrenium;
		}
		else if (type == "Gold") {
			return productDiscountGold;
		}
		else if (type == "Silver") {
			return productDiscountSilver;
		}
		return 0;
	}
}
