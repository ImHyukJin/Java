package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuiz01 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa123", "1234");
		map.put("bbb123", "5678");
		map.put("ccc123", "0000");
		
		/*
		 * 1. 아이디와 비밀번호를 입력받아서 맵에 있는 키인지 검사합니다.
		 * 2. 아이디가 존재하면, 비밀번호와 검사해서, 비밀번호가 일치하면 "로그인성공" 처리
		 * 
		 * 3. 비밀번호 다르다면, "비밀번호가 틀렸습니다" 출력하면 됩니다.
		 * 4. 만약 아이디가 맵에 입력된 키가 아니라면 "없는 아이디 입니다" 출력.
		 * 
		 * 5. 로그인이 성공할 때까지 다시 입력받습니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			String id = scan.next(); //키
			String pw = scan.next(); //값
			
			if( map.containsKey(id) ) { //true => 아이디가 존재함
				
				//값과 입력받은값 비교
				String value = map.get(id); //비번
				if(value.equals(pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다");
				}
			} else {
				System.out.println("아이디가 없습니다");
			}
			
		}

		
		
		
		
		
		
	}
}
