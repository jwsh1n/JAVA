package ch07;

public class CarExample {

	public static void main(String[] args) {

		Car Car1 = new Car("자가용");
		System.out.println("Car1.company: " + Car1.company);
		System.out.println("Car1.model" + Car1.model);
		System.out.println();

		Car Car2 = new Car("자가용", "빨강");
		System.out.println("Car2.company: " + Car2.company);
		System.out.println("Car2.model: " + Car2.model);
		System.out.println("Car2.color: " + Car2.color);
		System.out.println();

		Car Car3 = new Car("택시", "검정", 200);
		System.out.println("Car3.company: " + Car3.company);
		System.out.println("Car3.model: " + Car3.model);
		System.out.println("Car3.color: " + Car3.color);
		System.out.println("Car3.maxSpeed: " + Car3.maxSpeed);

	}
}
