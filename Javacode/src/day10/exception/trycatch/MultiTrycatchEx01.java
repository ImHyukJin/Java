package day10.exception.trycatch;

public class MultiTrycatchEx01 {

	public static void main(String[] args) {
		
		/*
		 * 참고로만 알아두기
		 * 
		 * main도 매개변수를 받을 수 있습니다.
		 * 
		 * Run -> Run configration -> arguement -> ${string_prompt}
		 */
		
		//1. 이 값을 숫자로 변경하고
		//2. 두 수의 합을 구한다
		
		try {
			
			String a1 = args[0];
			String a2 = args[1];
			
			int a = Integer.parseInt(a1); //문자열을 숫자로 변경하는 기능
			int b = Integer.parseInt(a2);
			
			System.out.println("두 수의 합:"  + (a + b)  );
			
			String str = null;
			str.charAt(0);
			
		} catch (ArrayIndexOutOfBoundsException e) { //처리할 예외의 종류가 들어갑니다
			System.out.println("반드시 매개값을 2개 넣어주세요");
		} catch (NumberFormatException | NullPointerException e ) {
			System.out.println("매개값을 숫자로 입력하세요");
		} catch (Exception e) {
			System.out.println("기타 예외 입니다");
		}

	
		
		
		
	}
}
