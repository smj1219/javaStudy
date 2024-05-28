package test.main;

import test.mypac.Score;
import test.mypac.Student;

public class ScoreTest {
	public static void main(String[] args) {
		myStudent(new Score());
	}
	public static void myStudent(Student s) {
		s.age=1;
		s.name="kimgura";
		s.korScore=98;
		s.engScore=78;
		s.mathScore=88;
		s.yourName();
		s.printScore();
	}
	
	
}
