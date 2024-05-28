package test.main;

import java.io.File;

public class MainClass06 {
	public static void main(String[] args) {
		//문자열 안에서 역슬래시는 특별한 기호이다.
		System.out.println("main메소드가 \"시작\" 되었습니다.");
		
		//File 객체의 메소드를 활용해서
		//실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		//존재하면 memo.txt 파일을 삭제하도록 프로그래밍 해보세요.
		
		//파일구분자를 /로 작성을해도 File 객체내부에서 알아서 처리해준다.
		File file = new File("C:/Users/user/playground/myFolder/memo.txt");
		try {
			if(file.exists()) {
				file.delete();
				System.out.println("삭제했습니다!");
			}else{
				file.createNewFile();
				System.out.println("만들었습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// C:\Users\ user\playground\myFolder\memo.txt 파일에 관련된 작업을 할 수있는 File 객체생성 
		File f = new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		try {
			
//			boolean isExist = f.exists();
//			f.createNewFile();
//			f.delete(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//문자열 안에서 역슬래시를 인식시키고 싶으면 2개를 작성한다.
		System.out.println("main 메소드가 \\종료\\ 됩니다.");
	}

}