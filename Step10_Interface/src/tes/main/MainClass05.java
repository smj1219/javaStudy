package tes.main;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		//인터페이스가 data type 의 역활울 하는 것을 확인!
		Calc c1 = null;
		
		//인터페이스 type 의 참조값을 얻어내는 방법
		Calc c2 = new Calc() {
			@Override
			public double execute(double num1, double num2) {
				return 0;
			}
		};
		//인터페이스 type 의 참조값을 함수 모양으로 얻어내기
		//매개변수의 type 은 선언할 필요가 없다. 매개 변수의 갯수만 맞으면 됨.
		Calc c3 = (a,b)->{
			return 0;
		};
		Calc add = (num1,num2)->{
			return num1+num2;
		};
		
		//매개 변수로 전달한 두수의 합이 리턴된다
		double result1 = add.execute(10, 20);
		//중괄호 안에서 따로 실행할 code 값이 없다면 중괄호 생략,
		//return 예약어 생략 후 리턴할 값만 명시하면 된다
		//함수 안에 return 하기 전에 실행할 코드가 없는 경우 (간단 로직인 경우) 사용가능
		Calc add2 = (num1, num2)->num1+num2;//한줄짜리 함수모양을 람다식 이라고도 한다
		
		double result2 = add2.execute(10, 5);
		
		Calc sub = (num1, num2)->num1-num2;
		Calc mul = (num1, num2)->num1*num2;
		Calc div = (num1, num2)->num1/num2;
		
		double result3 = sub.execute(100, 1);
		double result4 = mul.execute(2, 8);
		double result5 = div.execute(10, 2);
	}
}
