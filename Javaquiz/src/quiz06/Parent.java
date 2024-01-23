package quiz06;

public class Parent {
	
	/************부모님 클래스 손가락도 대지말기**********/
	
	String father;
	String mother;
	
	Parent(String father, String mother) {
		this.father = father;
		this.mother = mother;
	}
	
	void info() {
		System.out.println("아부지:" + father + ", 어무니:" + mother);
	}
	
	
	
}
