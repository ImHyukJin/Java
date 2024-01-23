package day02;

public class BreakEx03 {

	public static void main(String[] args) {
		
		//이름붙여 탈출하기(중첩반복문 에서)
		
		escape:for(int i = 1; i <= 10; i++) {
			
			for(int j = 1; j <= 10; j++) {
				
				System.out.println(i + "-" + j);
				if(j == 5) {
					break escape;
				}
				
			}
			
		}
		
		
		
		
		
		
		
//		boolean bool = false; //false라면 실행을 안함, true라면 실행했다.
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= 10; j++) {
//				
//				System.out.println(i + "-" + j);
//				if(j == 5) {
//					bool = true;
//					break;
//				}
//			} //inner
//			if(bool) break;
//		}
		
		
		
		
		
		
		
		
		
	}
}
