package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 AarratList<Integer> 객체를 생성해서 참조값을 지역변수 nums 에 담기
		List<Integer> nums = new ArrayList<>();
		//AarratList 객체에 10, 20, 30 숫지 3개를 담아보세요
		nums.add(10);
		nums.add(20);
		nums.add(30);
		//AarratList 객체에 저장된 숫자를 for 문을 이용해서 순서대로 콘솔창에 출력해보세요
		for(int i=0; i<nums.size(); i++) {
			//i 번째 인텍스 아이템 불러오기
			int tmp=nums.get(i);
			//콘솔창에 출력
			System.out.println(tmp);
		}
		// 인덱스의 순서대로 for 문을 사용할 때 사용하는 식
		System.out.println("확장 for 문을 활용하면..");
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	}
}
	
