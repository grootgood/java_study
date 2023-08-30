package java_study.chapter07.sec02;

public class Account {
	private String name;
	private String ssn;
	private int money;

	// 생성자, 멤버변수 값을 처음 넣어줄때 사용(멤버변수 초기화)
//	public Account(String name, String ssn, int money) {
//		this.name = name;
//		this.ssn = ssn;
//		this.money = money;
//	}

	public Account(String name, String ssn, int money) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	public int getMoney() { // getter
		return money;
	}

	public void setMoney(int money) { // setter
		this.money = money;
	}

	// 여기서 변수들은 왜 멤버변수일까?
	// 이 변수들에 해당하는 지역변수가 없으므로 어? 그럼 멤버변수이겠네 하고 판단.
	@Override
	public String toString() {
		return "Account [name=" + this.name + ", ssn=" + ssn + ", money=" + money + "]";
	} // 원래는 this.name, this.ssn 이지만 생략하고 사용

}

// 이클립스에서 보라색은 키워드
// 갈색은 지역변수
// 파란색은 멤버변수