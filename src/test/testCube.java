package test;

public class testCube {
	public static void main(String[] args) {
		try {
			Cube cube = new Cube(-2);
			cube.getVolume();
		} catch (CubeException ce) {
			System.out.println(ce.getMessage());
			ce.printStackTrace();
		}finally {
			System.out.println("1111");
		}
		int n[]=new int[2];
		n[2]=1;
		System.out.println("222");
		
	}
}
