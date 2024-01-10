package HelloWorld;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		radius = input.nextDouble();
		
		area = radius * radius * PI;
		
		System.out.println("원이 반지름은"+ radius +"이다.");
		System.out.println("원이 면적은"+ area +"이다.");
		
		}
		

}
