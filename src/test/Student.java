package test;

public class Student {
	int score=90;
	String name;
	public void playAndStudy(int play,int study) {
		score-=play;
		score+=study;
	}
	public void getScore() {
		System.out.println(name+" 的分數為 "+score);
	}
}