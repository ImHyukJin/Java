package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		//백준 - 10813번
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //N
		int b = scan.nextInt(); //M
		
		int[] arr = new int[a]; //N크기 배열
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		//a크기만큼 회전 하면서, 재입력
		for(int i = 0; i < b; i++) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int temp = arr[x-1];
			arr[x-1] = arr[y-1];
			arr[y-1] = temp;
		}
		//출력
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) break;
			str += " ";
		}
		System.out.println(str);
		
		
		
		
		
		
		
	}
}
