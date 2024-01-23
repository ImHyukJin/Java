package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic2 {

	public static void main(String[] args) {
		
		//입력받은 문자열을 순서대로 배열에 추가
		Scanner scan = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("입력>");
			String name = scan.next();
			arr[i] = name;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
	}
}
