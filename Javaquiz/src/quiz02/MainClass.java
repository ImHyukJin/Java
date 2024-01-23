package quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 20, 180);
		hong.info();
		
		Person park = new Person();
		park.age = 40;
		park.tall = 170;
		park.name = "이순신";
		park.info();
		
		
	}
}
