package ch04;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// for( int i=0; 100>=i; i++) {
		// System.out.println(i);
		// } // 1부터 100까지 출력

		// for( int i=1; 100>=i; i+=2) {
		// System.out.println(i);
		// } //1부터 100까지 홀수만 출력
		for (int i = 1; 100 >= i; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		// 1부터 100까지의 합
		// for( int i=31; 50>=i; i++) {
		// System.out.println(i);
		// } //31부터 50까지 출력
		// for( int i=32; i<=50; i+=2) {
		// System.out.println(i);
		// } //31부터 50까지 짝수만 출력

	}

}
