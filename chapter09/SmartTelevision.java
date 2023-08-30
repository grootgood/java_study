package java_study.chapter09;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOf() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 볼륨 : " + volume);
	}

	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
