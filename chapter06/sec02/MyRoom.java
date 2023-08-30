package java_study.chapter06.sec02;

public class MyRoom {

	public static void main(String[] args) {

		Tv myTv = new Tv();
		// int a = 10; int->데이터 타입, a->변수명, 10->인스턴스
		// Tv myTv = ; Tv->데이터 타입
		myTv.ch = 100;
		myTv.vol = 50;
		myTv.onOff = true;
		System.out.println(myTv); // 참조변수를 print

		Tv yourTv = new Tv();
		yourTv.ch = 200;
		yourTv.vol = 60;
		yourTv.onOff = false;
		System.out.println(yourTv);
	}
}