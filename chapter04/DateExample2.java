package java_study.chapter04;

import java.util.Date;

public class DateExample2 {

	public static void main(String[] args) {

		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();

		System.out.println(day);
		switch (day) {
		case 0:
		case 6:
			System.out.println("자바 공부하러 가");
			break;
		default:
			break;
		}

	}

}
