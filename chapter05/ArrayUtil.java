package java_study.chapter05;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

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

	static int findMaxValue(int[] data) {
		int max = data[0];
		int maxIx = 0;
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
				maxIx = i;
			}
		}
		return maxIx;
	}

	static int findMinValue(int[] data, int start, int end) {
		int min = data[start];
		int minIx = start;
		for (int i = start; i < end; i++) {
			if (min > data[i]) {
				min = data[i];
				minIx = i;
			}
		}
		return minIx;
	}

	static void swap(int[] data, int ix1, int ix2) {
		int tmp;
		tmp = data[ix1];
		data[ix1] = data[ix2];
		data[ix2] = tmp;
	}

	// -8.7-
	// length 길이의 배열을 생성해서,
	// until까지의 랜덤한 값을 채움
	// 배열을 리턴
	static int[] getRandomArray(int length, int util) {
		int[] data = new int[length];
		Random r = new Random(5); // 여기서 5는 seed 값이라고 함.
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(331);
		}
		return data; // 참조값을 return
	}

}
