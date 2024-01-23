package day02;

public class MultiForEx01 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.println(i + "-" + j);
			}
		}
		
		System.out.println("-------------------------------");
		
		//바깥 반복회전수에 따라서, 내부 반복의 횟수가 달라지는 경우
		
		//i = 1, j = 1바퀴
		//i = 2, j = 2바퀴
		//i = 10, j = 10바퀴
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.println(i + "-" + j);
			}
			
		}
		
		
		
		
		
		
		
	}
}
