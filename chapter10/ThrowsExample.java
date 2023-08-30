package java_study.chapter10;

public class ThrowsExample {

	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 후속 작업

	}

	public static void findClass() throws ClassNotFoundException {
		Class calzz = Class.forName("java.lang.String2");
	}
}
