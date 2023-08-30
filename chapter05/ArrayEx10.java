package java_study.chapter05;

public class ArrayEx10 {

	// 배열의 입력을 받아서 구성
	// 최솟값을 찾아서, 인덱스 0번과 교환
	public static void main(String[] args) {

//		int[] data = new int[5];
//
//		// 데이터 입력
//		ArrayUtil.getNumbers("숫자 입력>>", data);

		// getRandomArray();를 써서 ...
		int[] data = ArrayUtil.getRandomArray(10, 100);

		// 8.7 오름차순 정렬 -> '카드 정렬'이라고도 함
		for (int i = 0; i < data.length; i++) {
			int minIx = ArrayUtil.findMinValue(data, i, data.length);
			// 인덱스 0 위치와 minIx의 값을 교환
			ArrayUtil.swap(data, i, minIx);
			ArrayUtil.showNumbers(data);
		}
	}
}
