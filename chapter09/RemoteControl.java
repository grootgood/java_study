package java_study.chapter09;

public interface RemoteControl {

	int MAX_VOLUME = 10; // static final 생략
	int MIN_VOLUME = 0; // 상수이기 때문에 기울어짐

	// 추상 메서드 -> 메서드 선언부만 작성
	void turnOn();

	void turnOf();

	void setVolume(int Volume);

	default void setMenu(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
