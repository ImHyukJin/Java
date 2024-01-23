package day01;

public class Casting02 {

	public static void main(String[] args) {
		
		//2. 크기가 큰 타입을 작은 타입에 저장할 때는 (type) 캐스팅을 합니다.
		
		int i = 70;
		
		byte b = (byte)i; //int -> byte형변환
		
		char c = (char)i; //int -> char형변환
		
		System.out.println(b);
		System.out.println(c);
		
		float f = 3.14F;
		int j = (int)f; //float -> int 형변환
		
		//주의할점
		//형변환시 저장할 수없는 범위가 들어오면 잘려나간값 이 저장됩니다.
		int k = 1000;
		byte bb = (byte)k; 
		
		System.out.println(bb);
		
		//예외적인 형변환 - char-> short형으로 변경할 때도 명시적으로 형변환
		char cc = 'A';
		short ss = (short)cc;
		
		
		
		
	}
}
