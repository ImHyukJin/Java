package quiz18;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		

		//updown게임
		//1~100까지 임의의 랜덤한 정수가 결정되고, 정답을 맞추는 프로그램

		Scanner scan = new Scanner(System.in);
		//1~100까지의 임의 숫자를 생성. -정답
		int num = (int)(Math.random() * 100 + 1);
		
		int count = 0;
		
		while(true) {
			
			try {
				System.out.print("정답입력>");
				int answer = scan.nextInt();
				
				count++;
				
				if(num == answer) { //정답인경우
					System.out.println("정답입니다!");
					break;
				} else if(num < answer) { //정답이 더 작은 경우
					System.out.println("더 작은 수를 입력하세요");
				} else { //
					System.out.println("더 큰 수를 입력하세요");
				}
				
			} catch (Exception e) {
				System.out.println("숫자로만 입력하세요");
				scan.nextLine(); //엔터값 제거
				count++;
			}
			
			
			
		}
		
		
		System.out.println("정답횟수:" + count);
		
		
		
		
	}
}
