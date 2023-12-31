package java_study.chapter13.sec01;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:/temp/test.txt")) {

			int readCharNo;
			char[] cbuf = new char[100];
			while ((readCharNo = fr.read(cbuf)) != -1) {
				String data = new String(cbuf, 0, readCharNo);
				System.out.println(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
