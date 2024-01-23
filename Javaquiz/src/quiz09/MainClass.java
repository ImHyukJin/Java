package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart cart = new MyCart(3000);
		
		//cart.info();
		
		cart.buy("tv");
		cart.buy("tv");
		cart.buy("tv");
		cart.buy("com");
		cart.buy("radio");
		
		cart.info();
		
	}
}
