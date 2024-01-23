package day04;

public class MethodEx01 {
	
	
	public static void main(String[] args) {
		
		/*
		 * 1. 메서드는 클래스 안, 메서드 밖에 만듭니다.
		 */
		
		System.out.println( calc() );
		System.out.println( calc() );
		System.out.println( calc() );
		
		int result = calc();
		System.out.println(result);
		
		String result2 = randomStr();
		System.out.println(result2);
		
	} //end main
	
	//반환유형 이름() {}
	static int calc() {
		//여태 main에서 했던 모든 작업을 여기서 똑같이 다 할 수 있음
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum; //일단 맞춰놔
	}
	
	static String randomStr() {
		
		double ran = Math.random(); //0 <= x < 1.0
//		String str = "";
//		if(ran > 0.66) {
//			str = "야";
//		} else if(ran > 0.33) {
//			str = "임마";
//		} else {
//			str = "너";
//		}
//		return str; // 
		
		if(ran > 0.66) {
			return "야";
		} else if(ran > 0.33) {
			return "임마";
		} else {
			return "너";
		}
		
	}
	
	
	
	

}
