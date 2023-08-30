package java_study.chapter07.sec02;

public class AccountUse {

	public static void main(String[] args) {
		Account a1 = new Account("홍길동", "990115", 10000);
		System.out.println(a1);
		// = System.out.println(a1.toString());

		Account a2 = new Account("홍길동", "910115", 10000);
		System.out.println(a2);
		// = System.out.println(a2.toString());

		// 현재 잔액만 출력
		a2.setMoney(200000);
		System.out.println(a2.getMoney());

		// Account a3 = new Account(); // 에러! 생성자가 존재하므로, 기본 생성자 자동 추가되지 않음
	}
}
