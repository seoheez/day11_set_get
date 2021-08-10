package day11_set_get;

public class Ex02_This {

	public int age;//어떠한 값도 없는 상태. 인스턴스는 자동초기화. 지역변수는 초기화를 해줘야함.
//	public void ageFunc(int age) {age = age-1;} //0이 나옴. this를 적어야함.
	public void ageFunc(int age) {this.age = age-1;}
	public void printAge() {
		System.out.println("당신의 나이: " + age);
	}
}
