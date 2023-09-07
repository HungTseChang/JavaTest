package homework9;

public class homework9_1  {
	static boolean ready = false;
	public static void main(String[] args) {

		System.out.println("-----大胃王快食比賽開始!-----");
		bigEater contestant1 = new bigEater("饅頭人",10);
		bigEater contestant2 = new bigEater("詹姆士",10);
		
		contestant1.start(); 
		contestant2.start();
		ready=true;
		try {
			contestant1.join();
			contestant2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("-----大胃王快食比賽結束!-----");

	}
}

class bigEater extends Thread {
	private String name;
	private int rice;
	
	bigEater(String name, int rice) {
		this.name = name;
		this.rice = rice;
	}
	
	public void run() {
		while(!homework9_1.ready) {
		}
		for (int i = 1; i <= rice; i++) {
			try {
				Thread.sleep((long)(Math.random()*2501+500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "吃第" + i + "碗飯");
		}
		System.out.println(name + "吃完了!");
	}
}
