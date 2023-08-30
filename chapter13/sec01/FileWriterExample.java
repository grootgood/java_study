package java_study.chapter13.sec01;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		File file = new File("C:/temp/file.txt"); // File 객체는 try() 안에 들어갈 수 없다.
		try (FileWriter fw = new FileWriter(file, true)) {
			fw.write("FileWriter는 한글로 된 \r\n");
			fw.write("문자열을 바로 출력할 수 있다. \r\n");
			fw.flush();
			System.out.println("파일에 저장되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
