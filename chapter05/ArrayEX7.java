package java_study.chapter05;

import java.util.Scanner;

public class ArrayEX7 {

	// SRP(Single Responsibility Principle), 단일 책임의 원칙
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[5]; // 0으로 자동 초기화

		System.out.print("점수 >>"); // 입출력시 버퍼링이 동작하기 때문에 엔터 앞에 데이터를 여러개 줄 수 있음
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();

		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}
		System.out.println("전체 합계 : " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체 평균" + avg);

		int sum2 = 0;

		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 되는 합계 : " + sum2);
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println("300인 값이 저장된 인덱스" + i);
			}
		}
	}
}
