package ch07.sec02;

public class Computer extends Calculator {
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

	/*public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double areaCircle(double r) {
		// TODO Auto-generated method stub
		return super.areaCircle(r);
	}*/

	
}
