package quiz02;

public class Tv {

	boolean power;
	int channel;
	String company;
	
	//off on
	void power() {
		if(power) {
			power = false;
			System.out.println("TV Off");
		} else {
			power = true;
			System.out.println("TV On");
		}
		
	}
	
	//change channel
	int changeChannel(int ch) {
		channel = ch;
		System.out.println(channel + "번으로 변경");
		
		return channel;
	}
	
	//info
	String info() {
		System.out.println("제조사:" + company);
		System.out.println("현재채널:" + channel);
		
		return "제조사:" + company;
	}
	
	
	
	
	
}
