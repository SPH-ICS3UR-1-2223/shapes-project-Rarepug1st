package shapes;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	private double perimeter;
	private double area;
	
	//Methods
	public Triangle() {
		this.sideA = 1;
		this.sideB= 1;
		this.sideC =1;
	}
	
	public Triangle(double a, double b, double c) {
		this.sideA = a;
		this.sideB =b;
		this.sideC =c;
		
		
	}
	
	private double findPerimeter() {
		return this.sideA+this.sideB+this.sideC;
	}
	
	private double findArea() {
		return (this.sideA*this.sideB)/2;
	}
	
	public void printStats() {
		System.out.println("Circle ");
		System.out.println("Hight = "+ this.sideA);
		System.out.println("base = "+ this.sideB);
		System.out.println("Side C ="+ this.sideC);
		System.out.println("perimeter =" + this.perimeter);
		System.out.println("area = "+ this.area);
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}
	
	
}
