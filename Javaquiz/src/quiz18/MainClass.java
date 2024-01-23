package quiz18;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면, 두 정수의 합을 출력하고 반복문을 종료
		 * 3. 입력받은 값이 에러를 발생시키면, "정수로만 입력하세요" 를 출력하고 다시 입력받습니다.
		 * 4. 반복을 탈출하면 "프로그램 정상종료" 문장을 띄워주면 됩니다.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
					
		while(true) {
			
			try {
				System.out.print("숫자1>");
				int a = scan.nextInt();
				System.out.print("숫자2>");
				int b = scan.nextInt();
				
				System.out.println(a + b);
				break;
				
			} catch (Exception e) {
				System.out.println("정수로만 입력하세요");
				scan.nextLine(); //잔류하는 엔터값 제거
			}
			
		}
		
		
		System.out.println("프로그램 정상종료");
		
		
		
		
		
		
	}
}
