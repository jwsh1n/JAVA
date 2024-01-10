package HelloWorld;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a; // 입력받은 물건의 가격 값

		Scanner input = new Scanner(System.in);
		System.out.println("물건의 가격(1,000원 이하)를 입력하세요 :");
		a = input.nextInt();

		int b = 1000 - a; // 1,000원에서 물건 값을 뺀 가격
		System.out.println("물건 값은 " + a + "원 입니다.");
		System.out.println("거스름 돈은 " + b + "원 입니다.");

		int obeak = 0;
		int beak = 0;
		int osib = 0;
		int sib = 0;
		int o = 0;
		int il = 0;
		int g1 = 0;
		int g2 = 0;
		int g3 = 0;
		int g4 = 0;
		int g5 = 0;
		int g6 = 0;
		

		obeak = b / 500;
		g1 = b % 500;
		beak = b % 500 / 100;
		g2 = b % 500 % 100;
		osib = b % 500 % 100 / 50;
		g3 = b % 500 % 100 % 50 ;
		sib = b % 500 % 100 % 50 / 10;
		g4 = b % 500 % 100 % 50 % 10;
		o = b % 500 % 100 % 50 % 10 / 5;
		g5 = b % 500 % 100 % 50 % 10 % 5;
		il = b % 500 % 100 % 50 % 10 % 5 / 1;
		g6 = b % 500 % 100 % 50 % 10 % 5 % 1;

		System.out.println("\n거스름 돈의 내역은 다음과 같습니다.");
		System.out.println("500원 짜리 동전 갯수 : " + obeak + "개");
		System.out.println("500원 거슬러주고 남은 돈 : " + g1 + "원");
		System.out.println("100원 짜리 동전 갯수 : " + beak + "개");
		System.out.println("100원 거슬러주고 남은 돈 : " + g2 + "원");
		System.out.println("50원 짜리 동전 갯수 : " + osib + "개");
		System.out.println("50원 거슬러주고 남은 돈 : " + g3 + "원");
		System.out.println("10원 짜리 동전 갯수 : " + sib + "개");
		System.out.println("10원 거슬러주고 남은 돈 : " + g4 + "원");
		System.out.println("5원 짜리 동전 갯수 : " + o + "개");
		System.out.println("5원 거슬러주고 남은 돈 : " + g5 + "원");
		System.out.println("1원 짜리 동전 갯수 : " + il + "개");
		System.out.println("1원 거슬러주고 남은 돈 : " + g6 + "원");

	}

}
