package java_study.chapter04;

public class ForMultiplicationTableExample2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 빈줄 추가
		}
	}
}
