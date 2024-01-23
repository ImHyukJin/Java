package day08.poly.basic2;

public class House {
	
	//멤버변수 - Person을 저장할 수 있는 배열
	private Person[] arr = new Person[10];
	private int i = 0;
	
	//Person객체를 받아서 멤버변수에 저장한다.
	public void addPerson(Person p) {
		arr[i] = p;
		i++;
	}	
	////////////////////////////////////////////////
	//Person객체의 정보를 출력합니다.
	public void printPerson(Person p) {
		System.out.println(p.info() );
	}
	//Person배열 객체를 받아서 정보를 출력합니다.
	public void printPerson(Person[] persons) {
		
		for(int i = 0; i < persons.length; i++) {
			Person p = persons[i];
			System.out.println(p.info() );
		}
		
	}
	////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
