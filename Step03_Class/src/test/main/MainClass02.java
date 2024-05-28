package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car 클래스로 객체를 생성해서 참조값을 car1 이라는 Car type 지역변수에 담기
		Car car1 = new Car();
		//Car 클래스로 객체를 생성해서 참조값을 car2 라는 Car type 지역 변수에 담기
		Car car2 = new Car();
		
		//필드에 String type 의 참조값 대입하기
		car1.name="소나타";
		car2.name="그랜져";
		
		//메소드 호출하기
		car1.drive();
		car2.drive();
		
		//다른 객체이므로 false 이다
		boolean result = car1 == car2;
		//car2 에 들어있는 참조값을 car3 라는 지역변수에 대입하기
		Car car3 = car2;
		car3.drive();
		// 동일 객체 (car2와 car3에 저장된 참조값이 같다) 이므로 true 이다
		boolean result2 = car2 == car3;
	}
}
