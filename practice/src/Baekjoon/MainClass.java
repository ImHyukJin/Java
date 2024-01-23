package Baekjoon;

public class MainClass{

	public static void main(String[] args) {
		MyCart c1 = new MyCart(10000) ;
		c1.buy("tv");
		c1.buy("com");
		c1.buy("radio");
		c1.buy("tv");
		c1.buy("www");
		c1.info();
	
	}
}
