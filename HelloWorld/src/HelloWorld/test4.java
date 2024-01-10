package HelloWorld;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;  // 실습 전 과제점수
		int b;  // 실습 과제 점수
		int c;  // 실습 후 과제점수
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("실습 전 과제 점수를 입력해주세요.");
		a = input.nextInt();
		
		System.out.println("실습 과제 점수를 입력해주세요.");
		b = input.nextInt();
		
		System.out.println("실습 후 과제 점수를 입력해주세요.");
		c = input.nextInt();
		
		
		System.out.println("최종 실습 점수 : " + (((double)a/20 + (double)c/30 ) *20 + (double)b/25*60));
		System.out.println("실습 전 과제 점수 :" + a + "\n실습 과제 점수 : "  + b + "\n실습 후 과제 점수 : "  + c + "\n최종 실습 점수 : "  + (((double)a/20 + (double)c/30 ) *20 + (double)b/25*60) );
	}

}
