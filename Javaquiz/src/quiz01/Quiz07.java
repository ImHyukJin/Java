package quiz01;

public class Quiz07 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요", "hello", "니하오", "$%^" };
		
		//힌트- Math.random() 으로 랜덤하게 인덱스번호를 생성합니다.
		
		int d = (int)(Math.random() * arr.length);
		System.out.println( "선택된단어:" + arr[d]  );
		
		switch ( arr[d] ) {
		case "안녕하세요":
			System.out.println("한국어 입니다");
			break;
		case "hello":
			System.out.println("영어 입니다");
			break;
		case "니하오":
			System.out.println("중국어 입니다");
			break;
		default:
			System.out.println("알 수 없는 언어 입니다");
			break;
		}
		
		
		
		
		
		
	}
}
