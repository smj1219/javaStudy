package test.mypac;

public abstract class Student {
	public int age;
	public String name;
	public int korScore;
	public int engScore;
	public int mathScore;
	
//	public Student () {
//		this.age=age;
//		name=name;
//		korScore=korScore;
//		this.engScore=engScore;
//		this.mathScore=mathScore;
//	}
	public abstract void yourName();
	
	public void printScore() {
		System.out.println("국어 점수 : "+this.korScore+"점");
		System.out.println("영어 점수 : "+this.engScore+"점");
		System.out.println("수학 점수 : "+this.mathScore+"점");
	}
}
