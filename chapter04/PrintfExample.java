package java_study.chapter04;

public class PrintfExample {
	public static void main(String[] args) {

		double value = 12.345678;
		String result = "작은 값";

		System.out.printf("계산 결과는 %f 입니다.\n", value);
		System.out.printf("계산 결과는 %.3f 입니다.\n", value);
		System.out.printf("계산 결과는 %.1f 입니다.\n", value);
		System.out.printf("계산 결과는 %.0f 입니다.\n", value);
		System.out.printf("%s의 값은 %.2f 입니다", result, value);
	}
}
