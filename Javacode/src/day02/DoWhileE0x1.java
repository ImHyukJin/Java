package day02;

public class DoWhileE0x1 {

	public static void main(String[] args) {
		
		//while문으로 1~10까지 합계
		int i = 1;
		
		int sum = 0; //누적변수
		while(i <= 10) {
			
			sum += i;
			
			i++;
		}
		
		System.out.println("합계:" + sum);
		System.out.println("--------------------------------------------");
		
		//차이점은 - 첫번째 회전은 무조건 실행됩니다.
		
		int x = 100; //제어변수
		int sum2= 0; 
		do {
			
			sum2 += x;
			
			x++;
		} while ( x <= 10 );
		
		System.out.println("합계:" + sum2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
