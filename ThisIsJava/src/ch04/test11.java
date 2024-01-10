package ch04;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int again; // 계속 여부
		int guessNumber; // 사용자가 추측한 숫자
		int count = 0; // 추측한 횟수
		int sentinel; // 감시 숫자
		int targetNumber = (int) (Math.random() * 100) + 1; // 사용자가 맞추려고 노력하는 숫자

		Scanner scan = new Scanner(System.in);
		System.out.println(targetNumber);
		while (true) {

			System.out.println(count + "번째 시도");
			System.out.println("입력해주세요");
			System.out.println("============");
			guessNumber = scan.nextInt();
			if (guessNumber < targetNumber) {
				System.out.println("입력숫자가 더 작습니다.");
			} else if (guessNumber > targetNumber) {
				System.out.println("입력숫자가 더 큽니다.");
			}
			count = count + 1;
			if (guessNumber == targetNumber) {
				System.out.println("정답숫자는" + targetNumber + "입니다.");
				System.out.println(count + "번만에 맞추셨습니다.");

				System.out.println("다시하시겠습니까? (계속하기를 원한다면 1 입력)");
				again = scan.nextInt();
				targetNumber = (int) (Math.random() * 100) + 1;
				if (again == 1) {

					continue;

				} else {
					break;
				}
			}
		}

	}

}
