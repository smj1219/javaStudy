package test.main;

import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나눌 수 입력");
		String inputNum1 = scan.nextLine();
		
		System.out.println("나누어지는 수 입력:");
		String inputNum2 = scan.nextLine();
		//문자열 형태의 숫자를 실제 정수로 변경하기
	try {
		int num1 = Integer.parseInt(inputNum1);
		int num2 = Integer.parseInt(inputNum2);
		//계산하기
		int result = num2/num1; //몫
		int result2 = num2%num1; //나머지
		System.out.println(num2 + " 를 " + num1 + "으로 나눈 몫 :" +result);
		System.out.println(num2 + " 를 " + num1 + "으로 나눈 몫 :" +result2);
	}catch(Exception e) {
		//Exception Type 은 모든예외의 부모 type 이기 때문에 모든예외가 여기서 처리된다.
		System.out.println("예외가 발생했습니다.");
		System.out.println("예외메세지 : " + e.getMessage());
	}finally {
		//여기는 예외가 발생을 하든 안하든 반드시 실행이 보장되는 블럭이다.
		//중요한 마무리작업을 여기서 주로 수행한다.
		System.out.println("중요한 마무리작업을 합니다.");
		}
	System.out.println("main 메소드가 정상 종료됩니다.");
	}
}