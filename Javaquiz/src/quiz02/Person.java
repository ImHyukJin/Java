package quiz02;

public class Person {

	String name;
	int age;
	int tall;
	
	//기본생성자
	Person() {}
	
	
	//멤버변수 모두를 초기화하는 생성자
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	
	void info() {
		System.out.println(name);
		System.out.println("나이:" + age);
		System.out.println("키:" + tall);
	}
}
