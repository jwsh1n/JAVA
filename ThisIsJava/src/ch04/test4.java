package ch04;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gumae;
		int halin=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("구매 금액을 입력해주세요.");
		gumae = scan.nextInt();
		
		if(gumae>=300000) {
			halin = 30000;
		}else if(300000>gumae&&gumae>=100000){
			halin = 5000;
		}else {
			halin = 0;
		}
		int chungGu= gumae-halin;
		
		System.out.println("구매 금액:\t"+gumae);
		System.out.println("청구 금액:\t"+ chungGu );
		
		
	}

}
