package homework4;

public class Homework4_1 {
	public static void main(String[] args) {
		int num[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 },avg = 0;
		for (int i = 0; i < num.length; i++)
			avg += num[i];
		System.out.print("平均數:"+(avg = avg / num.length)+"\n大於平均數的數:");
		for (int i = 0; i < num.length; i++)
			if (num[i] > avg)
				System.out.print(num[i] + " ");
		
		System.out.println("\n=================================================================");
		
		String str = "Hello World";
		for(int i = str.length();i>0;i--)
			System.out.print(str.substring(i-1,i)); 
		
		System.out.println("\n=================================================================");
		
		String star[]= {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count=0;
		for(int i=0; i < star.length;i++)
			for(int j=0; j < star[i].length();j++)
				switch (star[i].charAt(j)) {
				case 'a': 
					count++;
					break;
				case 'e': 
					count++;
					break;
				case 'i': 
					count++;
					break;
				case 'o': 
					count++;
					break;
				case 'u': 
					count++;
					break;
				default:
					break;
			}
		System.out.println("總共"+count+"個母音");

	}

}
