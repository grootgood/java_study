package java_study.chapter05;

public class CallByReferenceEX {

	public static void main(String[] args) {
		int[] data = { 100, 200 }; // reference 배열

		swap(data);
		System.out.printf("%d %d\n", data[0], data[1]);
	}

	// 배열의 첫번쩨, 두번째 엘리먼트 교환
	static void swap(int[] data2) {
		int tmp;
		tmp = data2[0];
		data2[0] = data2[1];
		data2[1] = tmp;
		System.out.printf("%d %d\n", data2[0], data2[1]);
	}
}
