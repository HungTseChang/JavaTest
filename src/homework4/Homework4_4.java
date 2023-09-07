package homework4;

public class Homework4_4 {
	public static void main(String[] args) {
		int testScore[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int count[]=new int[8];
		int highScore, highNo;
		for (int test = 0; test < testScore.length; test++) {
			highScore = testScore[test][0];
			highNo = 0;
			for (int no = 1; no < testScore[test].length; no++)
				if (highScore < testScore[test][no]) {
					highScore = testScore[test][no];
					highNo = no;
				}
			count[highNo]++;
		}
		for(int i=0;i<8;i++)
			System.out.println( (i+1) + "號學生考最高的次數為" + (count[i]) + "次");
	}
}
