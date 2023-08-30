package java_study.chapter03;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = new String("안녕하세요");
		String str2 = new String("안녕하세요");

		System.out.println(str1);
		System.out.println(str2);

		// == : js --> 내용검사
		// == : java --> 참조값 검사

		if (str1 == str2) {
			System.out.println("두 문자열 동등");
		} else {
			System.out.println("두 문자열 다름");
		}
	}

}
