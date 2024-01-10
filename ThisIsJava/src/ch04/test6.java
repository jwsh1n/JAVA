package ch04;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yeonDo;

		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		yeonDo = scan.nextInt();

		if (yeonDo % 4 == 0) {
			if (yeonDo % 100 == 0) {
				if (yeonDo % 400 == 0) {
					System.out.println(yeonDo + "년은 윤년입니다.");
				} else {
					System.out.println(yeonDo + "년은 윤년이 아닙니다.");
				}
			} else {
				System.out.println(yeonDo + "년은 윤년입니다.");
			}
		} else {
			System.out.println(yeonDo + "년은 윤년이 아닙니다.");
		}

	}
}
