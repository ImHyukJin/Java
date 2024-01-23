package day01;

public class Operation02 {

	public static void main(String[] args) {
		
		//산술연산
		int i = 7 / 3; //몫 2
		int j = 7 % 3; //나머지 1
		int k = 7 * 3; //21
		
		//비교연산
		System.out.println(i == j); // 2 == 1
		System.out.println(i != j); // t
		System.out.println(i >= j); // t
		System.out.println(i < j);  // f
		System.out.println(k != 21); //f
		System.out.println(k % 2 == 1); //t
		System.out.println(k % 2 != 0); //t
		
		System.out.println("------------------------------------");
		
		//비트연산자 (구경만 해) & | ^
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		
		System.out.println( a & b ); //0000 0001 둘다 1이면 1, 아니면0
		System.out.println( a | b ); //0000 0111 둘중 하나만 1이면 1, 아니면0
		System.out.println( a ^ b ); //0000 0110 다르면 1, 같으면 0
		
		//비트쉬프트 (구경만 해) >> <<
		int h = 192;
		System.out.println(h << 3);
		
		
		
		
	}
}
