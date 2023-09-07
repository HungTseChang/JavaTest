package test;

public class Animal {
	private int age;
	private float weight;
	public Animal(int age, float weight) {
		if(age > 0)
			this.age = age;
		else
			System.out.println("請確認年齡設定");
		if(weight > 0)
			this.weight = weight;
		else
			System.out.println("請確認體重設定");
	}
	public Animal(int age) {
		this(age, 30.0f);
	}
	public Animal(float weight) {
		this(10, weight);
	}
	public Animal() {
		this(10, 30.0f);
	}
	public void speak() {
		System.out.println("年齡:"+age+"\n體重:"+weight);
	}
	public void setAge(int age) {
		if(age > 0)
			this.age = age;
		else
			System.out.println("請確認年齡設定");
	}
	public void setWeight(float weight) {
		if(weight > 0)
			this.weight = weight;
		else
			System.out.println("請確認體重設定");
	}

}
