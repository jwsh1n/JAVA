package ch05;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		int max = -1;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] :");
					scores[i] = Integer.parseInt(scan.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "] :" + scores[i]);
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(scores[i]>max) {max = scores[i];}
				}
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+(double)sum/scores.length);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
