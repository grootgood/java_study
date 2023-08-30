package java_study.chapter07.sec04;

public class MyRoom {

	public static void main(String[] args) {
		System.out.println(Tv.count); // Tv 클래스 생성 이전부터 존재함을 확인하기 위해 코드 작성, 클래스명을 통해서 접근해야 함.

		Tv myTv = new Tv(7, 9, true);
		Tv yourTv = new Tv(9, 12, true);

		System.out.println(myTv);
		System.out.println(yourTv);

		Tv[] arr = new Tv[100];
		for (int i = 0; i < 100; i++) {
			Tv tv = new Tv(1, 1, true);
			arr[i] = tv;
			// arr[i] = new Tv(1,1,true);
			System.out.println(i + "번째 " + arr[i]);
		}

		System.out.println(myTv.getChannel());
		System.out.println(yourTv.getChannel());
		System.out.println(arr[0]);

		int[] numbers = { 1, 2, 3 }; // primitive 데이터 타입
		Tv[] tvArrs = { new Tv(10, 10, false), new Tv(11, 10, true), new Tv(12, 10, false) }; // 참조형 데이터 타입

		System.out.println(Tv.count); // 지금까지 만든 Tv 개수 출력
		System.out.println(myTv.count);
		System.out.println("myTv의 serial number :" + myTv.getSerial());
	}
}
