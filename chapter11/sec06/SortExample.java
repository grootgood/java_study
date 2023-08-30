package java_study.chapter11.sec06;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 34, 102, 11 };

		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));

		int index = Arrays.binarySearch(scores, 99); // 추가
		System.out.println("찾은 인덱스: " + index); // 추가

		String[] names = { "홍길동", "김길동", "박길동" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		index = Arrays.binarySearch(names, "홍길동"); // 추가
		System.out.println("찾은 인덱스 : " + index); // 추가

		Member[] members = { new Member("홍길동", 10), new Member("김길동", 5), new Member("박길동", 3), };
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));

		index = Arrays.binarySearch(members, new Member("홍길동", 10)); // 추가
		System.out.println("찾은 인덱스 : " + index); // 추가
	}
}
