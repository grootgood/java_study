package java_study.chapter11.sec06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExample {

	public static void main(String[] args) {
		Date now = new Date(); // import 할 때 주의! 동일 imort(?) 있음
		String strNow1 = now.toString();
		System.out.println(strNow1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초"); // 'a'-> 오전, 오후 표시
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
