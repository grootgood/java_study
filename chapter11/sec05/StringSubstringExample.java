package java_study.chapter11.sec05;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

		// Quiz. 파일의 확장명을 추출하세요.
		String filename = "Hello.World.mp3";
		int ix = filename.lastIndexOf('.');
		if (ix != -1) { // '.'이 없을 수도 있기 때문에 검사 반드시 필요!
			String ext = filename.substring(ix);
			System.out.println(ext);
			ext = filename.substring(ix + 1);
			System.out.println(ext);

		}

		// Quiz. 확장명을 제외한 파일명(baseName)만 추출하세요.
		String filename2 = "Hello.World.mp3";
		int ix2 = filename2.lastIndexOf('.');
		if (ix2 != -1) {
			String baseName = filename2.substring(0, ix2);
			System.out.println(baseName);
		}
	}
}
