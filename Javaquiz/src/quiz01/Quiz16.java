package quiz01;

public class Quiz16 {

	public static void main(String[] args) {
		
		//단
//		for(int i=2; i<=9; i++) {
//			//System.out.println("구구단:" + i + "단");
//			//행
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + "x" + j + "=" + i*j);
//
//			}
//			System.out.println(); //줄바꿈
//		}
		
		
		
		
//		System.out.println("그럼 이건어때 ^0^");
//		System.out.println("힌트: 출력은 무조건 가로로 일어나고 정렬은 \\t를 사용한다");
//		for(int i=2; i<=9; i++) {
//			
//			for(int j=1; j<=9; j++) {
//				System.out.print( i + " x " + j + " = " + i*j + "\t" );
//			
//				if(j % 3 == 0) System.out.println();
//			}
//			
//			System.out.println();
//		}
		
		
		
		
		
		
		System.out.println("그럼 이건어때 ^0^");
		System.out.println("힌트: 출력은 한행씩 한번에, \\t를 사용한다.");
		System.out.println("힌트: 단의 증가는 3씩이다");
		
		//단
		for(int i = 1; i <= 9; i+=3 ) { 
			
			//행
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", i, j, i*j);
				System.out.printf("%d x %d = %d\t", i+1, j, (i+1)*j);
				System.out.printf("%d x %d = %d\t", i+2, j, (i+2)*j);
				
				System.out.println();
			}
			
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
	}
}
