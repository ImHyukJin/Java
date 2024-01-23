package day02;

public class ForEx02 {

	public static void main(String[] args) {
		
		//랜덤한 정수가 소수인지 판별 for
		//소수 = 약수가 1과 자기자신인 수
		int ran = (int)(Math.random() * 100) + 1; //1~100
				
		/*
		 * 1. ran수까지 회전을 한다.
		 * 2. 약수의 개수를 센다.
		 * 3. for문 밖에서 개수확인한다.
		 */
		System.out.println("랜덤수:" + ran);
		
		int cnt = 0; //개수를 셀 변수
		for(int i = 1; i <= ran; i++) {
			if(ran % i == 0) { //약수의 의미
				cnt++; //약수의 개수를 체크
			}
		}
		
		System.out.println( cnt == 2 ? "소수입니다" : "소수가 아닙니다");
		
		
		
		
		
		
		
				
	}
}
