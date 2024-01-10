package ch04;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalcreditearned; // 총 이수학점

		// 토익 점수를 저장하는 변수를 선언한다
		int toeic;

		// Scanner 객체를 생성하고 scan이 가리키게 한다
		Scanner scan = new Scanner(System.in);

		// 총 이수학점을 입력받는다
		System.out.print("총 이수학점을 입력하세요: ");
		totalcreditearned = scan.nextInt();

		// TOEIC 점수를 입력받는다
		System.out.print("토익 점수를 입력하세요: ");
		toeic = scan.nextInt();

		// 총 이수학점과 TOEIC 점수에 따라 졸업/수료/졸업불가 여부를 출력한다
		if (totalcreditearned>=140) {
			if (toeic>=700) {
				System.out.println("졸업을 축하합니다.");
			} else{
				System.out.println("아쉽지만 수료하셨습니다.");
			}
		} else{
			System.out.println("졸업이 불가합니다.");
		}

	}

}
