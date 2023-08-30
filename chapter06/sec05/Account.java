package java_study.chapter06.sec05;

public class Account {
	String name;
	String accoutName;
	private int balance;

	public void deposit(int amount) { // amount: 입금액
		balance += amount;

		System.out.println(name + "이" + amount + "원을 입금하다.");
	}

	public void widthdraw(int amount) {
		if (amount > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
			// 이 if문을 통과하게 되면 마지막에 return; 으로 인해
			// 밑 코드는 실행 x
		}

		balance -= amount;
		System.out.println(name + "이 적금통장에서 출금하다.");
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accoutName=" + accoutName + ", balance=" + balance + "]";
	}
}
