package day07.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		
		//호텔객체생성
		
		Hotel hotel = new Hotel();
		
		//setter메서드의 사용법
		//1st
		//hotel.setChef(new Chef());
		//2nd
		Chef c = new Chef();
		hotel.setChef(c);
		
		//getter메서드의 사용법
		Chef chef = hotel.getChef();
		chef.cooking();

		
		
		
		
	}
}
