package java_study.chapter06.sec01;

public class MyRoom {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		// new는 항상 0으로 초기화 ????
		p1.internet();
		p1.color = "검정";
		p1.shape = "폴더";

		Phone p2 = new Phone();
		p2.talkByKakao();
		p2.color = "빨강";
		p2.shape = "네모";

		System.out.println(p2.color);
		System.out.println(p2.shape);
	}
}
