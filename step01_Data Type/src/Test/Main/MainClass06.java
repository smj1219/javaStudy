package Test.Main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//지역변수를 선언만 하면? 만들어지지 않는다
		int num;
		String name1;
		
		//아직 만들어지지 않았기 떄문에 num은 참조 불가
		//int result = 10+num:
		//아직 만들어지지 않았기 때문에 name1 은 참조 불가
		//System.out.println(name1);
		System.out.println("main 메소드가 종료됩니다.");
	}
}
