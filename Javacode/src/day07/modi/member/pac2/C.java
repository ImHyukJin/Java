package day07.modi.member.pac2;

import day07.modi.member.pac1.A;

public class C {

	A a = new A(1); //public (o)
	//A a2 = new A(true); //default (x)
	//A a3 = new A("홍길동"); //private (x)
	
	//-----------------------------------------
	
	public C() {
		
		A a = new A();
		a.var1 = 1;
		//a.var2 = 2; //default (x)
		//a.var3 = 3; //private (x)
		
		a.method01();
		//a.method02(); //default (x)
		//a.method03(); //private (x)
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

