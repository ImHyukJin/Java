package day08.poly.basic2;

public class MainClass {

	public static void main(String[] args) {

		//ctrl + alt + 방향키
//		Student s1 = new Student("홍길동", 20, "123123");
//		Student s2 = new Student("홍길자", 30, "456456"); 
//		Student s3 = new Student("이순신", 40, "555555"); 
//		Teacher t1 = new Teacher("피카츄", 20, "언제언제 까지나");
//		Teacher t2 = new Teacher("라이츄", 30, "진실한 마음으로");
//		Employee e1 = new Employee("손흥민", 40, "111");
//		
//		Student[] arr = {s1, s2, s3};
//		Teacher[] arr2 = {t1, t2};
//		Employee[] arr3 = {e1 };
//		
//		for(Student s : arr ) {
//			System.out.println(s.info());
//		}
		
		
		//다형성 적용 (부모타입으로 자동 형변환)
		Person s1 = new Student("홍길동", 20, "123123");
		Person s2 = new Student("홍길자", 30, "456456"); 
		Person s3 = new Student("이순신", 40, "555555"); 
		Person t1 = new Teacher("피카츄", 20, "언제언제 까지나");
		Person t2 = new Teacher("라이츄", 30, "진실한 마음으로");
		Person e1 = new Employee("손흥민", 40, "111");
		
		Person[] arr = {s1, s2, s3, t1, t2, e1 };
		
		for(Person p : arr ) {
			System.out.println(p.info()); //오버라이드 되었으면 먼저실행됨
		}
		
		
		System.out.println("-----------------------");
		////////////////////////////////////
		//House객체를 사용하고 싶다.
		House house = new House();
		
		house.printPerson(s1);
		house.printPerson(s2);
		house.printPerson(arr);
		house.addPerson(s1);
		house.addPerson(s2);
		
		System.out.println("------------------------");
		
		//MainClass m = new MainClass();
		//m.personInfo(e1);
		
		personInfo(e1); //e1은 실제로 Employee
		
	} //end main
	
	//instanceOf확인
	public static void personInfo(Person p) {
		
		if(p instanceof Student) { //p가 Student타입 이면 true
			Student s = (Student)p;
			System.out.println(s.info() );
			
		} else if(p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println(e.info() );
			
		} else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info() );
			
		} else if(p instanceof Person) {
			System.out.println("person입니다");
		}
		
		
	}
	
	
}
