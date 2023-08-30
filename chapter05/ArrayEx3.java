package java_study.chapter05;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 }; // new int[] 생략되어있음
		int[] arr2 = new int[] { 5, 6, 7, 8 }; // 이게 fm
		// arr = {10,11,12} // 이거는 에러
		arr = new int[] { 10, 11, 12 }; // 이거는 기존의 배열을 버리고 다른 배열을 참조하겠다라는 의미
	}

}
