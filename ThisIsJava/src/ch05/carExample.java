package ch05;

public class carExample {

	public static void main(String[] args) {
		
		car myCar = new car();
		
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색깔 : "+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
		
		myCar.color = "빨강";
		System.out.println("수정된 색깔: "+myCar.color);

	}

}
