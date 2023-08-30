package java_study.chapter09;

public class Television implements RemoteControl {
	// 필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");

	}

	@Override
	public void turnOf() {
		System.out.println("Tv를 끕니다.");

	}

	@Override
	public void setVolume(int Volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume
		}

	}

}
