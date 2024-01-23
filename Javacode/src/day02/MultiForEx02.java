package day02;

public class MultiForEx02 {

	public static void main(String[] args) {

		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */

		//바깥 반복문 - 행, 내부반복문이 출력
		int star = 5;
		for(int i = 1; i <= star; i++ ) {

			for(int j = 1; j <= i; j++) {
				System.out.print("☆");
			}

			System.out.println();

		}

		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		for(int i = 1; i <= star; i++) {

			for(int j = 1; j <= star+1-i; j++) {
				System.out.print("☆");
			}
				
			System.out.println();

		}

		/*
		 * ____*
		 * ___***
		 * __*****
		 * _*******
		 * *********
		 */
		//행
		star = 5;
		for(int i = 1; i <= star; i++) { 

			//공백
			for(int j = 1; j <= star-i; j++) {
				System.out.print(" ");
			}
			//별
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("★");
			}
			
			System.out.println();
		}


















	}
}
