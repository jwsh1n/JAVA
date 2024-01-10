package HelloWorld;

import java.util.*;;

public class Ppackage {

	public static void main(String[] args) {
		double driveDistance; // 주행거리
		double fuels; // 사용한 휘발유 양
		
		Scanner input =  new Scanner(System.in);
		System.out.println("주행거리를 입력하세요 :");
		driveDistance = input.nextDouble();
		System.out.println("사용한 휘발유 양을 입력하세요 :");
		fuels = input.nextDouble();

		double fuelEfficiency = (driveDistance/fuels); // 연비
		System.out.println("연비 : " + fuelEfficiency);
		
	}

}
