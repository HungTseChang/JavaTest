package test;

public class Elphant extends Animal {
	String name;

	public Elphant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}

	public void speak() {
		super.speak();
		System.out.println("名字:" + name);
	}
}
