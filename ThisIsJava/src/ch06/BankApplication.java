package ch06;

import java.util.*;

public class BankApplication {

	private static Account[] accountArray = new Account[100]; // 계좌 여러명 생성하기 위해 배열
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		System.out.print("예금주: ");
		String owner = scan.nextLine();
		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(scan.nextLine());

		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null)
				break;
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());

		}

	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano1 = scan.nextLine();
		System.out.print("예금액: ");
		int balance1 = Integer.parseInt(scan.nextLine());
		;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (ano1.equals(accountArray[i].getAno())) {
					accountArray[i].deposit1(balance1);
				}
			}
		}

	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano2 = scan.nextLine();
		System.out.print("출금액: ");
		int balance2 = Integer.parseInt(scan.nextLine());
		;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (ano2.equals(accountArray[i].getAno())) {
					accountArray[i].withdraw1(balance2);
					System.out.println("결과: 출금이 성공되었습니다.");

				}

			}
		}
	}
}