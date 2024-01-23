package day07.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//변수를 public으로 열어두면, 잘못된 값(유효성 검증 불가)이 저장될 수 있습니다.
		MyBirth me = new MyBirth();
		
		me.year = 2023;
		me.month = 11;
		me.day = 35;
		me.ssn = "내알빠? 이게뭔데?";
		
		me.info();
		
		
		
		
	}
}
