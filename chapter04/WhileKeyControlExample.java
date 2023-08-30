package java_study.chapter04;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {

		boolean run = true; // 상태변수
		int speed = 0;
		int keycode = 0;

		while (run) {
			if (keycode != 13 && keycode != 10) {
				System.out.println("-------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-------------------------");
				System.out.println("선택: ");
			}
			keycode = System.in.read();

			if (keycode == 49) { // 1
				speed++;
				System.out.println("현재속도=" + speed);
			} else if (keycode == 50) { // 2
				speed--;
				System.out.println("현재속도=" + speed);
			} else if (keycode == 51) { // 3
				run = false; // 종료조건
			}
		}
		System.out.println("프로그램 종료");
	}
}
