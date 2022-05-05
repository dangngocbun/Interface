package advance.dev.models;

public class Circle extends Shape {
	private double bk;

	public Circle(String name, double bk) {
		super(name);
		this.bk = bk;
	}

	public double chuVi() {
		return bk *2 * Math.PI;
	}
	public double dienTich() {
		return bk * bk * Math.PI;
	}
	
	
	
}
