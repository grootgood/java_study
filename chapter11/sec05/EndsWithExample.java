package java_study.chapter11.sec05;

import java.util.Scanner;

public class EndsWithExample {

	// 사용자로부터 파일명을 입력받는다. 파일명이 mp3 파일인지 참, 여부를 따져라.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("파일명을 입력하세요 >>");
		String filename = scan.nextLine();
		String test = filename.toLowerCase();

		boolean check = test.endsWith(".mp3");
		System.out.println(check);

		if (test.endsWith(".mp3")) {
			System.out.println("음악 파일입니다.");
		} else {
			System.out.println("음악 파일이 아닙니다.");
		}

		scan.close();
	}
}
