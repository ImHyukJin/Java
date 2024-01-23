package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		/*
		 * ****
		 * ****
		 * ****
		 * 
		 */
		
		//행
//		for(int i = 1; i <= 10; i++) {
//			//출력
//			for(int j = 1; j <= 4; j++) {
//				
//				if(i % 2 == 0) { //짝수행
//					System.out.print("*");			
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println(); //줄바꿈
//		}
		
		//가로, 세로를 입력 받습니다.
		//가로 길이, 세로길의 사각형을 출력하면 됩니다.
		//단, 윤곽만 나타나도록 처리를 합니다.
		//힌트 =  첫행과 마지막행, 첫열 마지막열
		
		System.out.println("대학교 1학년 과제였습니다^0^");
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int w = scan.nextInt(); //열
		System.out.print("세로>");
		int h = scan.nextInt(); //행
		
		for(int i = 1; i <= h; i++) { //행
			
			for(int j = 1; j <= w; j++) { //열(출력)
				if(i == 1 || i == h || j == 1 || j == w ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
