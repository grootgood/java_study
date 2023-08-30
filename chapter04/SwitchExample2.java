package java_study.chapter04;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("저녁에 메뉴는 1)짜장면, 2)우동, 3)라면");
		String food = scan.nextLine();

		switch (food) {
		case "짜장면":
			System.out.println("중국집으로");
			break;
		case "우동":
			System.out.println("우동집으로");
			break;
		default:
			System.out.println("라면집으로");
			break;

		}

	}

}
