package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		//입력을 1개 받아서 짝수, 홀수, 0, 음수 조건나누기
		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		System.out.print(">");
		int num = scan.nextInt(); //홀수 : num % 2 == 1, 짝수: num % 2 == 0

		if( num == 0 ) {
			System.out.println("0 입니다");			
		} else if( num < 0) {
			System.out.println(num + "은 음수입니다");
		} else if( num % 2 == 0) {
			System.out.println(num + "은 짝수입니다");
		} else {
			System.out.println(num + "은 홀수입니다");
		}
		
		
		scan.close();
		
		
		
		
		
		
		
	}
}
