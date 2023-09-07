package test;

public class Cube {
	double length;

	public Cube() {
	}

	public Cube(double length) throws CubeException {
		if (length <= 0)
			throw new CubeException("正方形邊長不得為0或負數");
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) throws CubeException {
		if (length <= 0)
			throw new CubeException("正方形邊長不得為0或負數");
		this.length = length;
	}

	public void getVolume() {
		System.out.println(length * length * length);
	}
}
