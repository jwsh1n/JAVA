package HelloWorld;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first;
		int second;
		
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("첫 번째 정수를 입력하세요 : " );
		first = input.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : " );
		second = input.nextInt();
		
		System.out.println("두 수의 합 : " + (first + second) );
		System.out.println("두 수의 차 : " + (first - second) );
		System.out.println("두 수의 곱 : " + (first * second) );
		
		
	}

}
