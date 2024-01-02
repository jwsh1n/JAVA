package ch04;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0; // 입력 받는 점수
		int totalCount = 0; // 점수들의 총수
		int Acount = 0; // A 학점의 수 90점 이상
		int Bcount = 0; // B 학점의 수 90점 미만 80점 이상
		int Ccount = 0; // C 학점의 수 80점 미만 70점 이상
		int Dcount = 0; // D 학점의 수 70점 미만 60점 이상
		int Fcount = 0; // F 학점의 수 60점 미

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("점수를 입력하세요(종료하려면 -1을 입력) : ");
			score = scan.nextInt();
			if (score == -1) {
				break;
			} else {
				if (score >= 90) {
					Acount++;
				} else if (score >= 80) {
					Bcount++;
				} else if (score >= 70) {
					Ccount++;
				} else if (score >= 60) {
					Dcount++;
				} else if (score < 60) {
					Fcount++;
				}

				totalCount += 1;

			}
		} // 98 76 82 87 79 75 62 47 85 53 -1
		System.out.println("점수들의 총수 : " + totalCount);
		System.out.println("A학점수 : " + Acount);
		System.out.println("B학점수 : " + Bcount);
		System.out.println("C학점수 : " + Ccount);
		System.out.println("D학점수 : " + Dcount);
		System.out.println("F학점수 : " + Fcount);

	}

}
