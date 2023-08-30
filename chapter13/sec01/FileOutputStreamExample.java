package java_study.chapter13.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String originalFileName = "C:/temp/house.jpg";
		String targetFileName = "C:/temp/house_copy.jpg";

		try (FileInputStream fis = new FileInputStream(originalFileName);
				FileOutputStream fos = new FileOutputStream(targetFileName);) {
			// new FileOutputStream(targetFileName, true)를 하게 되면 기존 데이터 살리고 끝에다가 append

			int readByteNo;
			byte[] readBytes = new byte[100];
			while ((readByteNo = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteNo);
			}
			fos.flush();
			System.out.println("복사완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
