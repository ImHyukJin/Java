package day10.exception.throw_;

public class ThrowEx01 {

	public static void main(String[] args) {
		
		/*
		 * throw - 예외 강제로 발생시키기
		 * 
		 * 메서드나 생성자에서 throw new 예외클래스()
		 * 를 만나면 예외가 생성됩니다.
		 * 
		 * throw키워드를 만나면 
		 * try~catch 문장이나 throws키워드로 예외처리를 진행해야 합니다.
		 * 
		 * throw특정 조건과 함께 catch문장으로 프로그램 실행을 옴길 때 사용가능합니다.
		 */
		try {

			int result = calc(-10);
			System.out.println(result);
			
		} catch (Exception e) {
			//System.out.println( e.getMessage() ); //예외 발생시 예외객체가 가지고 있는 메시지를 얻는 기능
			e.printStackTrace();
			//예외 경로를 추적하는 메시지를 출력하는 용도로 많이 사용됩니다.
			//예외 원인을 찾을 때, 개발시에 매번 사용됩니다.
		}
		
		System.out.println("프로그램 정상종료");
		
		
		
		
		
		
		
		
		
	}
	
	public static int calc(int n) throws Exception {
		
		//음수가 넘어오면 메서드 실행할 필요도 없이 강제종료
		if(n < 0) {
			throw new Exception("값을 양수로 전달하세요");
		}
		
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	
}
