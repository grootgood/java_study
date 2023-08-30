package java_study.chapter06.sec03;

public class Car {
	String color;
	// 같은 패키지에서는 접근 가능
	// 다른 패키지에서는 접근 불가

	public void run() {
		System.out.println("부릉부릉 달리다!");
	}

	public void up() {
		System.out.println("비싼 휘발유를 먹으러! 미친듯이 속도 up");
	}
}
