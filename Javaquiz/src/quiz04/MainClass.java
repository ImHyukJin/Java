package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Wizard wizard = new Wizard("helloworld");
		wizard.info();  
		wizard.iceArrow();
		
		
		Warrior war = new Warrior("헬로월드");
		war.info();
		war.bash();
		
		
		
	}
}
