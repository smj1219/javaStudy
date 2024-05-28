package test.main;

import test.mypac.Student;

public class ScoreTest02 {
	public static void main(String[] args) {
		
		myStudent(new Student() {
			
			@Override
			public void yourName() {
				System.out.println("학년 : "+ this.age +"학년");
				System.out.println("이름 : "+ this.name);
			}
		});
	}
	public static void myStudent(Student s) {
		s.age=1;
		s.name="김구라";
		s.engScore= 80;
		s.korScore= 94;
		s.mathScore= 76;
		s.yourName();
		s.printScore();
	}
}
