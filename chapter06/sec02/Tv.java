package java_study.chapter06.sec02;

public class Tv {

	// Java에는 '전역변수'라는 개념 x
	// Java에서는 멤버변수와 인스턴스 변수가 존재
	// 인스턴스 변수는 자동으로 0으로 초기화
	// 변수의 선언 -> 타입 변수명;
	// new 할때 복사가 되는 이 전역변수를 '인스턴스 변수'
	// 인스턴스라는 말은 실제값이라는 의미

	public int ch;
	public int vol;
	public boolean onOff; // false로 초기화

	public void chageChannel() {
		int change = 1;
		System.out.println(ch + change + "번호를 바꾸다.");
	}

	public void watchYoutube() {
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}
}