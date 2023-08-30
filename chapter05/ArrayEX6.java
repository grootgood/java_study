package java_study.chapter05;

import java.util.Scanner;

public class ArrayEX6 {

	public static void getNumbers(String inputTitle, int[] data) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < data.length; i++) {
			System.out.print(inputTitle);
			data[i] = sc.nextInt();
		}
	}

	static void showNumbers(int[] data) {
		for (int x : data) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	static int addAll(int[] data) {
		int sum = 0;
		for (int x : data) {
			sum += x;
		}
		return sum;
	}

	// SRP(Single Responsibility Principle), 단일 책임의 원칙
	public static void main(String[] args) {

		int[] jumsu = new int[5]; // 0으로 자동 초기화

		getNumbers("점수 >> ", jumsu); // call by reference
		showNumbers(jumsu);
		int sum = addAll(jumsu);

		System.out.println("전체 합계 : " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체 평균" + avg);
	}
}
