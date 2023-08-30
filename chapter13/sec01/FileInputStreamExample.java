package java_study.chapter13.sec01;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:/temp/test.txt")) {
			int data;
			while ((data = fis.read()) != -1) { // 매개변수에 아무것도 없으므로 1byte씩 읽고 콘솔에 출력
				System.out.write(data);
			}
			System.out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
