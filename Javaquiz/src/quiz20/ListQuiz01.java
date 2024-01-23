package quiz20;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {
		
		//1. 1~20까지 리스트에 저장하기
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
		
		System.out.println("------------------------------------");
		/* 2. User클래스를 저장하는 리스트를 생성하기
		 * 
		 * 1) User클래스 - name, age를 은닉변수로 선언, 생성자, getter, setter
		 * 2) 객체를 2개 생성해서 list에 추가하기
		 * 3) 이 리스트에 "홍길동" 이 있다면, 이름과 나이를 출력
		 * 4) 이 리스트에 "홍길자" 이 있다면, 객체를 삭제
		 */
		//User[] arr = {};
		
		List<User> list2 = new ArrayList<>();
		
		User u1 = new User("홍길동", 20);
		User u2 = new User("홍길자", 30);
		
		list2.add( u1 );
		list2.add( u2 );
		
		System.out.println(list2.toString());
		
		
		for(int i = 0; i < list2.size(); i++) {
			
			//홍길동을 찾는다.
			User u = list2.get(i);
			String name = u.getName();
			if(name.equals("홍길동")) {
				System.out.println( u.getName() +"," + u.getAge()  );
			}
			//홍길자가 있다면 삭제.
			if( list2.get(i).getName().equals("홍길자")   ) {
				list2.remove(i); //인덱스번호로 삭제
			}
			
		}
		
		
		System.out.println(list2.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
