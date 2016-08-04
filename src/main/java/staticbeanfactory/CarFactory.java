package staticbeanfactory;


public class CarFactory {
	
	private static String dealer;
	
	public static void setDealer(String dealer) {
		CarFactory.dealer = dealer;
	}
	
	public static Car getCarObject() throws Exception{
		Car	c = (Car)Class.forName(dealer).newInstance();
		return c;
	}
}
