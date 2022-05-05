package advance.dev.models;

public abstract class Shape {
	protected String name;
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	public abstract double chuVi();
	public abstract double dienTich();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name:%s - cv:%.2f - dt:%.2f", name, chuVi(),dienTich());
	}
}
