package java_study.chapter04;

import java.util.Random;
import java.util.Scanner;

// 가위 0, 바위 1, 보 2 게임
public class Game1 {

	public static void main(String[] args) {

		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int computer = r.nextInt(3); // 3은 미포함 0, 1, 2 중에서 랜덤하게 정렬
			System.out.println("0:가위, 1:바위, 2:보, -1:종료>>");
			int me = sc.nextInt();

			if (me == -1) {
				System.out.println("정말 게임을 종료하시겠습니까?");
				me = sc.nextInt();
				if (me == -1)
					break;
			}

			System.out.printf("컴퓨터 : %d, 나 : %d", computer, me);

			if (me == computer) {
				System.out.println("비겼습니다.");
			} // 이후는 생략
		}

	}
}
