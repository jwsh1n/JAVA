package HelloWorld;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coverage = 500;
		int length;
		int width; 
		int height;
		
		Scanner input = new Scanner(System.in);
		System.out.println("사무실의 가로 길이를 입력하세요.");
		length = input.nextInt();
		System.out.println("사무실의 세로 길이를 입력하세요.");
		width = input.nextInt();
		System.out.println("사무실의 높이를 입력하세요.");
		height = input.nextInt();
		
		double totalSqMeter = (( length + width ) * height * 2.0 + length * width);
		System.out.println("\n사무실의 총 면적은 "+totalSqMeter+"입니다.");
		
		double paintNeeded = (totalSqMeter / coverage);
		System.out.println("필요한 페인트의 통수는 " +paintNeeded+"개 이다.");
	}

}
