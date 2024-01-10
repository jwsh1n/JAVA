package ch04;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jungSu = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		jungSu = scan.nextInt();
		
		boolean multiple=false;

		if (jungSu % 3 == 0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}
		if (jungSu % 5 == 0) {
			System.out.println("5의 배수이다.");
			multiple = true;
		}
		if (jungSu % 8 == 0) {
			System.out.println("8의 배수이다.");
			multiple = true;
		}
		if (multiple==false){
			System.out.println("아무 배수도 아니다.");
		}
	}

}
