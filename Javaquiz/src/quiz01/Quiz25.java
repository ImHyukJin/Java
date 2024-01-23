package quiz01;

import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {

		//배열의 size는 조정하지 마세요.
		Scanner scan = new Scanner(System.in);

		String[] arr = new String[100]; //딱 100명만 수용가능
		int index = 0; //위치값

		System.out.println("먹고싶은 음식을 선택하세요");
		System.out.println("입력을 중지하려면 [그만]을 입력하세요");
		
		while(true) {
			System.out.print(">");
			String menu = scan.next();
			
			if(menu.equals("그만") ) {
				System.out.println("입력종료");
				break;
			}
			
			arr[index] = menu; //메뉴추가
			index++;
		}
		System.out.println("-------입력 받은 메뉴-------");
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
		
		
		

	}
}
