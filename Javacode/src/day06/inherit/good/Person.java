package day06.inherit.good;

public class Person extends Mother { //부모클래스

	String name;
	int age;
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
