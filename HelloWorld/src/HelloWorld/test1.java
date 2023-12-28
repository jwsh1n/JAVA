package HelloWorld;

public class test1 {

	public static void main(String[] args) {
	
		 int compgrade = 88;
		 int proggrade = 92;
		 int mathgrade = 79;
		 int archgrade = 80;
		 
		 double avg = ((double)(compgrade + proggrade + mathgrade + archgrade))/4;
		
		 System.out.println("영작문 과목의 점수 : " + compgrade);
		 System.out.println("프로그래밍 과목의 점수 : " + proggrade);
		 System.out.println("이산수학 과목의 점수 : " + mathgrade);
		 System.out.println("컴퓨터구조 과목의 점수 : " + archgrade);
		 System.out.println("평균 점수 : " + avg);

	}

}
