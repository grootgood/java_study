package java_study.chapter11.sec02;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compaerKey = (Key) obj;
			if (this.number == compaerKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
}
