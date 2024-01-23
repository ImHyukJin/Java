package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * return의 다양한 사용
		 * 
		 * - return값이 있는 메서드는 호출문 자체가 값이 됩니다.
		 * 그래서 다른 메서드의 매개값으로 사용될 수도 있습니다.
		 * - println( add(1,2) ) 
		 * 
		 * - 반환유형이 없는 메서드는 반환유형 자리에 void라고 적습니다.
		 * - return 키워드는 반환과, 종료의 의미를 가집니다.
		 *   void메서드에서 return은 단순히 종료의 의미로 사용됩니다.
		 * 
		 */
		
		int result = add( add(1,2)  , add(2,3)  );
		System.out.println(result);
		System.out.println( add(1,2) );
	
		
		//void형 메서드는 단순히 사용만 가능합니다.
		multi(); 
		//System.out.println( multi() ); //x
		//String str = multi(); //x
		
		noReturn("피카츄");
		
	}
	
	//매개변수 a, b를 받아서 합계를 반환한다.
	static int add(int a, int b) {
		
		return a + b;
	}
	
	//반환유형이 없는 메서드
	static void multi() {
		System.out.println("5 x 3 = 15");
	}
	
	//반환유형이 없는 메서드에서 return의 사용 (o)
	static void noReturn(String name) {
		
		if( name.equals("피카츄") ) {
			System.out.println("피카츄가 진화하면 라이츄입니다");
			return; //종료의 의미
			//int a = 1; //return문 아래에는 코드 작성이 불가능합니다.
		}
		
		
		System.out.println(name + "이 아니라 피카츄를 전달하세요");
	}
	
	
	
	
	
	
	
}
