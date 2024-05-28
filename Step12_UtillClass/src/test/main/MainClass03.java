package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		//인사말을 담은 ArrayList 객체를 생성해서 참조값을 List 인터페이스 type greets 라는 지역변수에 대입해보기
		List<String> greets = new ArrayList<String>();
		//인사말 3개를 임의로 담아보세요
		greets.add("Hi");
		greets.add("Hello");
		greets.add("안녕");
		
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		greets.forEach(con);
		
		System.out.println("-----------------------");//위와 동일한 방법을 간략화
		Consumer<String> con2 = (t)->{
			System.out.println(t);
		};
		greets.forEach(con2);
		
		System.out.println("-----------------------");//위 동일한 방법을 간략화
		greets.forEach((t)->{
			System.out.println(t);
		});
	}
}
