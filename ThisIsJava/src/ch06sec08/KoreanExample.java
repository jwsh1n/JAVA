package ch06sec08;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Korea k1 = new Korea("123456-1234567", "김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name = "김자바";
		
	}

}
