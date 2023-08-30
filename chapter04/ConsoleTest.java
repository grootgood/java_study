package java_study.chapter04;

import java.util.Scanner;

public class ConsoleTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름을 입력>>");
		String name = scan.next();

		System.out.print("소속을 입력>>");
		String company = scan.next();

		System.out.print("나이를 입력>>");
		int age = scan.nextInt();

		System.out.println(name);
		System.out.println(company);
		System.out.println(age);
	}
}
