package quiz03;

public class DmbPhone extends Phone {
	//1. DmbPhone은 Phone클래스를 상속 받습니다.
	//2. channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//3. 메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	
	int channel;

	DmbPhone(String pModel, String pColor, int ch) {
		model = pModel;
		color = pColor;
		channel = ch;
	}
	
	void turnOnDmb() {
		System.out.println("Tv를 켭니다");
	}
	
	int changeChannel(int ch) {
		channel = ch;
		System.out.println(channel + "번 변경");
		return channel;
	}
	
	void turnOffDmb() {
		System.out.println("Tv를 끕니다");
	}
	
	
	
	
	
	
	
	
}
