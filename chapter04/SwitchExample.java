package java_study.chapter04;

public class SwitchExample {

	public static void main(String[] args) {
		String name = "자바";

		// ctrl + shift + f -> 자동 들여쓰기
		switch (name) {
		case "자바":
			System.out.println("1호로 가세요");
			break;
		case "파이썬": // 파이썬 또는 리눅스라면 (OR)
		case "리눅스":
			System.out.println("2,3호로 가세요");
			break;
		case "C언어":
			System.out.println("4호로 가세요");
			break;
		default:
			System.out.println("카운터에 문의하세요");
			break; // 마지막에 break는 있어도 되고, 없어도 됨. 즉, 의미 없음
		}
	}
}
