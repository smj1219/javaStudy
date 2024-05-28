package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuizMain2 {
	public static void main(String args[]) {
		//1. 로또번호를 담을 HashSet 객체를 생성해서 set1 이라는 지역변수에 담아보세요
		List<Integer> set1 = new ArrayList<>();
		
		//2. while 문을 이용해서 랜덤한 로또번호를 set1에 반복적으로 담아보세요
		//	 while 문 탈출조건은 set1.size()가 6이되면 탈출되도록 해보세요.
		Random ran = new Random();
		//랜덤한 정수를 얻어내서
		while(true){
			int ranNum = ran.nextInt(45)+1;
			//set1 에 추가
			set1.add(ranNum);
			if(set1.size()==6){
				break;
			}
		}
		
		//3. set1에 담긴번호를 오름차순 정렬해서 콘솔창에 모두 출력해보세요.
		List<Integer> nums = new ArrayList<Integer>(set1);
		Collections.sort(nums);
		for(Integer tmp:nums) {
			System.out.print(tmp+" ");
		}
	}
}