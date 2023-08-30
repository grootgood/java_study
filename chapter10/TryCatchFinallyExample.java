package java_study.chapter10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try { // 예외가 발생할 가능성이 있는 문장
			Class clazz = Class.forName("java.lang.String");
			System.out.println(clazz); // 위 코드에서 예외가 발생했기 때문에 이 코드는 실행 x
			return;

		} catch (ClassNotFoundException e) { // ClassNotFoundException이 발생했을 경우, 이를 처리하기 위한 문장
			System.out.println("클래스가 존재하지 않습니다.");
			// e.printStackTrace();
		} finally { // 예외와 무관하게 항상 실행하는 코드
			System.out.println("=================");
		}
		System.out.println("프로그램 종료!");
	}
}
