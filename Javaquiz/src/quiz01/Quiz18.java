package quiz01;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
		/*
		 * 중첩반복문 - 회전수가 변해야 합니다.
		 * 
		 * num를 입력받았을 때, 1부터 num까지 수 중에서 (소수)의 합계 출력.
		 * 소수 - 약수가 1과 자기 자신인 수
		 * 
		 * num = 10 
		 * 2(약수2개) + 3(약수2개) + 5(약수2개) + 7(약수2개) = 17
		 * num = 11
		 * 2(약수2개) + 3(약수2개) + 5(약수2개) + 7(약수2개) + 11(약수2개) = 28 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = scan.nextInt();
		
		//디버깅 모드 - IDE(개발도구) 
		
		int sum = 0; //합계누적
		ex:for(int i = 1; i <= num; i++ ) {
			
			int count = 0; //약수개수 카운트
			
			for(int j = 1; j <= i; j++) {
				//약수 개수 확인
				if(i % j == 0) { //i의 약수는 j이다
					count++;
				}
				
				//약수가 2초과 라는 것은 이미 소수가 아니라는 뜻
				if(count > 2) {
					continue ex;
				}
				
			}
			//소수 였는지 판별 하고, 소수 였으면 합계를 구하고
			if(count == 2) { //i가 소수 일것이다.
				sum += i;
			}
			
		}
		
		System.out.println(num + "까지 소수들의 합계:" + sum);
		
		
		
	}
}
