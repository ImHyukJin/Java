package day01;

public class Operation03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		
		if( x != 10 && ++y == 20 ) { //&& 앞에 조건이 F 인 경우 뒤에를 실행하지 않았음
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
		
		
		System.out.println("x는:" + x + ", y는:" + y);

		
		x = 10;
		y = 20;
		
		if(x == 10 || ++y == 20 ) { // ||는 앞이 T인 경우 뒤에 실행하지 않음.
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x는:" + x + ", y는:" + y);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
