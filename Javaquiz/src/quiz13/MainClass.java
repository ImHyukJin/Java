package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		//카트생성
		MyCart cart = new MyCart(10000);
		
		cart.buy( new Tv() );
		cart.buy( new Radio() );
		cart.buy( new Computer() );
		cart.buy( new Tv() );
		
		
		cart.info();
		
	}
}
