package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
	
		/*
		 * 랜덤한 문제 내고, 정답맞추기
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		int okCount = 0; //정답카운트
		int noCount = 0; //오답카운트
		
		while(true) {
			
			int rn1 = (int)(Math.random() * 100) + 1;
			int rn2 = (int)(Math.random() * 100) + 1;
			
			System.out.println("-------------------");
			System.out.println(rn1 + " + " + rn2 + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			//조건 3개: 0인경우, 실제정답과 입력값이 같은경우, 다른경우
			if(answer == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if(rn1 + rn2 == answer) { //정답
				System.out.println("정답입니다");
				okCount++; 
			} else { //오답
				System.out.println("오답입니다");
				noCount++;
			}
			
		}
		
		System.out.println("정답:" + okCount);
		System.out.println("오답:" + noCount);
		
		
		
		
		
	}
}
