package day06.override.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println( p.info()  );
		
		Student s = new Student();
		s.name = "이순신";
		s.age = 30;
		s.studentId = "123456";
		System.out.println( s.info()  );
		
		Teacher t = new Teacher();
		t.name = "피카츄";
		t.age = 40;
		t.subject = "언제언제까지나";
		System.out.println( t.info() );
		
		Employee e = new Employee();
		e.name = "라이츄";
		e.age = 50;
		e.department = "마케팅";
		System.out.println( e.info() );

		
	}
}
