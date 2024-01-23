package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {

	public static void main(String[] args) {
		
		//메뉴관리 프로그램
		//맵을 사용하고 메뉴명을 key, 가격을 value 사용합니다.
		
		Map<String, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("-----메뉴관리-----");
			System.out.println("1. 메뉴등록(이미 등록된 메뉴인지 확인후에 등록)");
			System.out.println("2. 전체메뉴보기");
			System.out.println("3. 메뉴수정(변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정)");
			System.out.println("4. 메뉴삭제(변경할 메뉴를 받아서 메뉴가 있다면 삭제)");
			System.out.println("5. 프로그램종료");
			
			System.out.print("선택>");
			String menu = scan.next();
			
			switch (menu) {
			case "1":
				
				System.out.print("메뉴명>");
				String a = scan.next();
				System.out.print("가격>");
				int b = scan.nextInt();
				
				if(map.containsKey(a) ) {
					System.out.println("이미 등록된 메뉴입니다");
				} else {
					map.put(a, b);
				}
				
				break;
			case "2":
				
				//Set<Entry<String, Integer>> menus = map.entrySet();
				for(Entry<String, Integer> e : map.entrySet() ) {
					System.out.println("메뉴명:" + e.getKey() + ",가격:" + e.getValue());
				}
				
				break;
			case "3":
				
				System.out.print("변경할 메뉴>");
				String a2 = scan.next();
				
				if(map.containsKey(a2) ) {
					System.out.print("가격>");
					int b2 = scan.nextInt();
					map.put(a2, b2); //가격의 수정 (맵에서 수정은 동일한 키로 합니다)
				} else {
					System.out.println("없는 메뉴입니다.");
				}
				
				break;
			case "4":
				
				System.out.print("삭제할 메뉴>");
				String a3 = scan.next();
				
				if(map.containsKey(a3)) {
					map.remove(a3);
					System.out.println("삭제되었습니다");
				} else {
					System.out.println("없는 메뉴입니다.");
				}
				
				break;
			case "5":
				System.exit(0);

			default:
				break;
			}
			
			
		}
		
		
		
		
	}
}
