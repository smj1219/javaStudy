package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.PostDto;

/*
 * 	1. PostDto 클래스를 만들어보세요
 *     PostDto에는 글번호, 작성자, 제목을 담을 수 있어야합니다.
 *     즉, 3개의 필드를 만드세요.
 *     필드명은 마음대로. 필드의 Data Type 은 잘 생각해서 결정
 *     Dto 작성규약에 맞게 만들어주세요( eclipse generate 기능활용) 
 *     test.mypac 패키지에 만들기
 *     
 *  2. PostDto 객체에 임의의 글3개의 정보를 담아보세요.
 *     총 3개의 PostDto 객체가 생성이 되어야합니다.
 *  
 *  3. PostDto 객체를 담을 수 있는 ArrayList 객체를 생성해서, 
 *     위에서 생성한 PostDto 객체를 ArrayList 에 담아보세요
 *  
 *  4. 반복문 돌면서 ArrayList 에 담긴 글목록을 콘솔창에 이쁘게 출력해보세요.	*/

public class QuizMain3 {
	public static void main(String[] args) {
		PostDto dto1=new PostDto();
		dto1.setNum(1);
		dto1.setWiter("김구라");
		dto1.setTitle("html");
		
		PostDto dto2=new PostDto();
		dto2.setNum(2);
		dto2.setWiter("해골");
		dto2.setTitle("css");
		
		PostDto dto3=new PostDto(3, "원숭이","javascript");
		
		List<PostDto> post=new ArrayList<PostDto>();
		//ArrayList 는 순서가 있는 데이터이기 때문에 담긴 순서대로 저징되어 있다.
		post.add(dto1);
		post.add(dto2);
		post.add(dto3);
		
		for(PostDto tmp:post) {
			String info = String.format("글번호:%d, 작성자:%s, 제목:%s",
					tmp.getNum(),tmp.getWiter(),tmp.getTitle());
			System.out.println(info);
		}
	}
}