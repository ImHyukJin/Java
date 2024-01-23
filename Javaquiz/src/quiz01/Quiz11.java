package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		/*
		 * 1. 입력받는다.
		 * 2. 배열을 만드는데, 입력받은 값으로 배열을 만듬 
		 * 		int[] arr = new int[크기]
		 * 3. 배열에 순서대로 접근한다.
		 * 4. 값을 넣는다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요>");
		int num = scan.nextInt();
		
		int[] arr = new int[num]; //입력받은 수 크기의 배열
		
		//0 ~ 길이 미만
		int i = 0;
		while(i < arr.length) {
			arr[i] = i+1;
			i++;
		}
		
		//arr[인덱스] = 값
		
		System.out.println(  Arrays.toString(arr) );
		
		
		
		
	}
}
