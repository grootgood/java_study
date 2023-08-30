package java_study.chapter05;

public class CallByValueEx {

	public static void main(String[] args) {
		int x = 100; // Primitive 데이터
		int y = 200;

		swap(x, y);

		System.out.printf("x: %d, y: %d\n", x, y);

	}

	static void swap(int x, int y) {
		int tmp = 0;
		tmp = x;
		x = y;
		y = tmp;
		System.out.printf("x: %d, y: %d\n", x, y);
	}
}
