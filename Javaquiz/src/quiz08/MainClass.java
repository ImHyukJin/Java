package quiz08;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("과학6호기");
		
		ap.takeOff(); //상속
		ap.fly();
		ap.flyMode = 1;
		ap.fly();
		ap.land(); //상속
		
		
	}
}
