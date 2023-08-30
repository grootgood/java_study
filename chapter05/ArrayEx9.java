package java_study.chapter05;

public class ArrayEx9 {

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

	static int findMinValue(int[] data) {
		int min = data[0];
		int minIx = 0;
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
				minIx = i;
			}
		}
		return minIx;
	}

	public static void main(String[] args) {
		int[] save = new int[5];

		ArrayEX6.getNumbers("숫자 입력 >>", save);

		int maxIx = findMaxValue(save);
		int minIx = findMinValue(save);

		System.out.println("최고 점수" + save[maxIx]); // save[maxIx]
		System.out.println("최저 점수" + save[minIx]); // save[minIx]
	}
}
