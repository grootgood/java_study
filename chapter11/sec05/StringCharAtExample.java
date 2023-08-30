package java_study.chapter11.sec05;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1': // 1 or 3
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2': // 2 or 4
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
