package java_study.chapter06.sec05;

public class AccoutUse {

	public static void main(String[] args) {
		Account dad = new Account();
		dad.name = "홍길동";
		dad.accoutName = "적금통장";
		// dad.balance = 1000;

		dad.deposit(1000);
		dad.deposit(2000);
		dad.deposit(10000);

		dad.widthdraw(3000);
		dad.widthdraw(2000);

		System.out.println(dad);
	}
}
