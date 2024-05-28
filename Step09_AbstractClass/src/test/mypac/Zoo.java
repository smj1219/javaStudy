package test.mypac;

public class Zoo {
	//클래스 안에 클래스 정의하기(내부 클래스)
	public class Monkey{
		public void say() {
			System.out.println("안녕! 나는 원숭이야!");
		}
	}
	//내부 클래스(Inner Class)
	public class Tiger{
		public void say() {
			System.out.println("어흥!");
		}
	}
	
	//Zoo클래스의 멤버 메소드
	public Monkey getMonkey() {
		//내부 클래스 객체를 생성해서 리턴해 줄 수도 있다.
		return new Monkey();
	}
	public Tiger getTiger() {
		//내부 클래스 객체를 생성해서 리턴해 줄 수도 있다.
		return new Tiger();
	}
}
