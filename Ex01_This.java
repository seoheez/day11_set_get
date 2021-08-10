package day11_set_get;

public class Ex01_This {

	public int a = 10;
	public void func01() {
		int a = 12345;
		System.out.println("01 a : " + a);
		System.out.println("this: " + this);
		System.out.println("01 a : " + this.a);
//		this.func02(); //어떻게 접근해도 결과는 동일함.
//		func02();
		
	}
	public void func02() {
		System.out.println("02 a : " + a);
	}
	
}
