package java_study.chapter13.sec03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {

	// deserialize 역직렬화
	public static Object load(String filepath) throws Exception {
		// 예외 처리는 호출한 쪽에서 처리
		// 닫기(close)만 자동화
		try (FileInputStream fis = new FileInputStream(filepath); ObjectInputStream ois = new ObjectInputStream(fis);) {
			// 예외 던지기로 인해 catch는 없다.
			return ois.readObject(); // 인스턴스 복원
		}
	}

	// serialize 직렬화
	public static void save(String filepath, Object obj) throws Exception {
		try (FileOutputStream fos = new FileOutputStream(filepath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(obj);
			oos.flush();
		}
	}
}
