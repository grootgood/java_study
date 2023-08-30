package java_study.chapter06.sec04;

public class Block {
	int x = 1;
	int y = 2;
	// 만약 0으로 초기화 한다면 굳이 초기화할 필요 없음.
	// 왜냐하면 자동으로 초기화 해주기 때문.
	String color = null;
	// 참조형은 null로 초기화

	public void put() {
		int move = 50;
		System.out.println(move + "만큼 벽돌을 쌓다");
	}

	@Override
	public String toString() {
		return "Block [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

//	public String toString() {
//		return "벽돌틀 [x=" + x + ", y=" + y + ", color=" + color + "]";
//	}

}
