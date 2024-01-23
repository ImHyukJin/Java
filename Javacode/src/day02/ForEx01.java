package day02;

public class ForEx01 {

	public static void main(String[] args) {
	
		int sum = 0;
		for(int i = 1; i <= 10; i++ ) {
			sum += i;
		}
		
		System.out.println("합계:" + sum);
		System.out.println("--------------------------------------");
		
		//증가값을 2씩 (while문도 됩니다)
		//0~10까지 값 중에 짝수의 합.
		for(int i = 0; i <= 10; i+=2 ) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------");
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		
		
		
	}
	
	
	
}
