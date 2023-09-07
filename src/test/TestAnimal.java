package test;


public class TestAnimal {
	public static void main(String[] args) {
		Animal a[] = new Animal[2];
		a[0] = new Animal(3, 8);
		a[1] = new Elphant(8, 1200.0f, "大象");
		a[0].speak();
		a[1].speak();
	}
}
