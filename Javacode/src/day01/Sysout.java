package day01;

public class Sysout {

	public static void main(String[] args) {
		
		//주석 - 프로그램 실행에 영향을 미치지 않음 
		/*
			1. main이라고 쓰고 ctrl + space 메인이 자동생성됩니다.
			2. ctrl + f11 프로그램 실행
			3. sysout이라고 쓰고 ctrl + space 출력문이 자동생성됩니다.

			단축키
			정렬 - ctrl + i
			코드를 옴길때 - alt + 방향키
			행복사 ctrl + alt + 방향키  
			행삭제 ctrl + d
		 */
		//첫번째 출력문 println
		System.out.println("헬로월드");
		System.out.println("안녕하세요"); //ln 은 가장마지막에 자동으로 개행을 포함

		//두번째 출력문 print
		System.out.print("줄바꿈 없이 가로로 출력 작업을 할 때 사용함~~\n");

		//세번째 출력문 printf - 서식문자 or 탈출문자 를 이용한 출력
		/*
		 * 서식문자
		 * %d는 정수가 전달됨
		 * %f는 실수가 전달됨
		 * %s는 문자열이 전달됨
		 * 
		 * 탈출문자
		 * \n 줄바꿈
		 * \t tab버튼
		 * \r 캐리지리턴
		 * 
		 * 
		 */
		System.out.printf("오늘은 %d년 %d월 %d일 이고, 저는 %s 입니다\n", 2023, 10, 25, "coding404" ); //python - "문자열".format()

		System.out.printf("PI값은 %f , %.2f 입니다", 3.141592, 3.141592); //.2f 소수 2자리수까지 출력



	}

}
