package day04;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수는 메서드가 전달받는 필요한 값
		 * 메서드의 ()안에 타입과 함께 나열해주면 됩니다.
		 */
		
		int result = calc(10);
		System.out.println("1~10까지합:" + result);
		
		int result2 = calc(100);
		System.out.println("1~100까지합:" + result2);
		
		int result3 = calc2(10, 20);
		System.out.println("10~20까지합:" + result3);
		
		String result4 = calc3(1, 10, "홍길동");
		System.out.println("1~10까지 문자열합:" + result4);
		
	} //end main
	
	//반환유형 이름(매개변수) {} - 매개변수는 언제든 메서드 안에서 활용가능
	static int calc(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int calc2(int a, int b) {
		
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
	
	//calc3(int, int, String)
	static String calc3(int a, int b, String c) {
		
		//a~b까지 문자열c를 반복으로 붙여서 반환.
		String str = "";
		for(int i = a; i <= b; i++) {
			str += c;
		}
		
		return str;
	}
	
	
	
}
