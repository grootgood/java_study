package java_study.chapter13.sec01;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

// 파일 확장자가 .txt인지 여부 판단
class TextFileFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		System.out.println("필터링 :" + name);
		return name.toLowerCase().endsWith(".txt"); // endsWith의 리턴 타입은 boolean
	}
}

public class FileExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));

		// File 객체의 toString() 내용도 확인 --> 지정한 path 문자열 리턴
		if (dir.exists() == false) {
			System.out.println(dir + " 존재하지 않음");
			dir.mkdirs();
		}
		if (file1.exists() == false) {
			System.out.println(file1 + " 존재하지 않음");
			file1.createNewFile();
		}
		if (file2.exists() == false) {
			System.out.println(file2 + " 존재하지 않음");
			file2.createNewFile();
		}
		if (file3.exists() == false) {
			System.out.println(file3 + " 존재하지 않음");
			file3.createNewFile();
		}

		// File 클래스를 이용한 파일 및 디렉터리 정보 출력
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles(new TextFileFilter()); // listFiles() -> 해당 디렉토리 내의 모든 파일 및 하위 디렉토리의 배열을 반환

		System.out.println("날짜        시간             형태        크기         이름");
		System.out.println("--------------------------------------------------------");

		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName()); // file.getName() -> 파일명
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // file.length() -> 파일 크기
			}
			System.out.println();
		}
	}
}
