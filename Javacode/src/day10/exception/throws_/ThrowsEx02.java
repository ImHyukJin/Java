package day10.exception.throws_;

public class ThrowsEx02 {

	public ThrowsEx02() throws Exception {
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}
	
	public void aaa() throws Exception {
		System.out.println("aaa시작");
		bbb();
		System.out.println("aaa종료");
	}
	
	public void bbb() throws Exception {
		System.out.println("bbb시작");
		
		System.out.println(10 / 0); //exception
		
		System.out.println("bbb종료");
	}
	
}
