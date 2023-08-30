package java_study.chapter04;

import java.util.Scanner;

public class ConsoleTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일 입력: 주중1) 주말2) 공휴일3)");

		int data = sc.nextInt();
		if (data == 1) {
			System.out.println("주중 입니다");
		} else if (data == 2) {
			System.out.println("주말 입니다");
		} else {
			System.out.println("공휴일 입니다");
		}
	}
}
