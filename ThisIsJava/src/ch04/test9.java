package ch04;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu = 0; // 점수
		int count = 0; // 점수들의 수
		int max = -1; // 최고점수
		int min = 101; // 최저점수
		int sum = 0; // 합계
		double aver; // 평균점수

		Scanner scan = new Scanner(System.in);

		while (jumsu != -99) {
			System.out.print("점수(더 이상 점수가 없다면 -99)를 입력하세요 : ");
			jumsu = scan.nextInt();
			if (jumsu == -99) {
				break;
			} else {

				sum += jumsu;
				count += 1;
			}
			if (max < jumsu) {
				max = jumsu;
			}
			if (min > jumsu) {
				min = jumsu;
			}

		}
		aver = (double) sum / count;
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("평균 점수 : " + aver);

	}

}
