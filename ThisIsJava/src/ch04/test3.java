package ch04;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한 과목의 평가 요소들의 점수들을 저장하는 변수들을 선언한다
		int attendscore; // 출석점수 10
		int assignmentscore; // 과제점수 40
		int quizscore; // 수시점수 10
		int midtermexamscore;// 중간시험점수 20
		int finalexamscore; // 기말시험점수 20

		// 총점을 저장하는 변수를 선언한다
		double totalScore = 0;

		// 학점을 저장하는 변수를 선언한다

		// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
		Scanner scan = new Scanner(System.in);

		// 사용자로부터 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청한다.
		// 그리고 입력된 점수를 읽는다.
		System.out.print("출석 점수를 입력하세요:\t\t");
		attendscore = scan.nextInt();
		System.out.print("과제 점수를 입력하세요:\t\t");
		assignmentscore = scan.nextInt();
		System.out.print("수시 점수를 입력하세요:\t\t");
		quizscore = scan.nextInt();
		System.out.print("중간 시험 점수를 입력하세요:\t");
		midtermexamscore = scan.nextInt();
		System.out.print("기말 시험 점수를 입력하세요:\t");
		finalexamscore = scan.nextInt();
		// 여기에 코드를 삽입하세요

		// 총점을 계산한다
		// 여기에 코드를 삽입하세요
		totalScore = 10 * ((double) attendscore / 100) + 40 * ((double) assignmentscore / 100)
				+ 10 * ((double) quizscore / 100) + 20 * ((double) midtermexamscore / 100)
				+ 20 * ((double) finalexamscore / 100);

		// 학점을 결정한다
		String grade;

		// 여기에 코드를 삽입하세요
		if (100 >= totalScore && totalScore >= 90) {
			grade = "A";
		} else if (90 > totalScore && totalScore >= 80) {
			grade = "B";
		} else if (80 > totalScore && totalScore >= 70) {
			grade = "C";
		} else if (70 > totalScore && totalScore >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		// 총점과 학점을 출력한다
		// 여기에 코드를 삽입하세요
		System.out.println("총점:\t\t\t" + totalScore);
		System.out.println("학점:\t\t\t" + grade);
	}

}
