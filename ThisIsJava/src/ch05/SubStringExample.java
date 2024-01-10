package ch05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		
		//String firstNum = ssn.substring(0, 6);
		//System.out.println(firstNum);
		
		//String secondNum = ssn.substring(7);
		//System.out.println(secondNum);
		
		String Num1 = ssn.substring(0, 2);
		System.out.println(Num1);
		String Num2 = ssn.substring(2, 4);
		System.out.println(Num2);
		String Num3 = ssn.substring(4, 6);
		System.out.println(Num3);
		
	}

}
