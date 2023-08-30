package java_study.chapter07.sec03;

public class ComputerUser {

	public static void main(String[] args) {
		Computer c1 = new Computer(10000, "Apple", 30);
		Computer c2 = new Computer(20000, "Samsung", 50);

		System.out.println(c1); // c1.toString() 호출
		System.out.println(c2); // c2.toString() 호출

		Computer c3 = new Computer();
		c3.setPrice(10000);
		c3.setMaker("Intel");
		c3.setMonitor(20);

		System.out.println(c3); // c3.toString() 호출
	}

}
