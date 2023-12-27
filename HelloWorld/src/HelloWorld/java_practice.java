package HelloWorld;

public class java_practice {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples % sizeOfBucket) > 0 ? (numOfApples / sizeOfBucket + 1)
				: (numOfApples / sizeOfBucket));

		System.out.println("필요한 바구니의 수 :" + numOfBucket);

		int num1 = 10;
		System.out.println(num1 == 0 ? 0 : (num1 > 0 ? "양수" : "음수"));

		int num2 = 456;
		System.out.println(num2 - (num2 % 100));

		int num3 = 333;
		System.out.println(num3 - (num3 % 10) + 1);

		int num4 = 24;
		System.out.println((num4 - (num4 % 10) + 10) - num4);

		int fahrenheit = 100;
		float celcius = (5 / 9f * (fahrenheit - 32));

		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + String.format("%.2f", celcius));
	}
}
