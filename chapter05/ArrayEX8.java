package java_study.chapter05;

public class ArrayEX8 {

	public static void main(String[] args) {
		// 5개의 점수를 받아서 평균울 출력
		int[] jumsu = new int[5];

		ArrayUtil.getNumbers("점수 >> ", jumsu); // 같은 패키지 안에 있기 때문에 ArrayEX6 클래스의 getNumbers()와 showNumbers()에는 public 안
												// 붙여도 됨.
		ArrayUtil.showNumbers(jumsu);
		int sum = ArrayUtil.addAll(jumsu);

		double avg = (double) sum / jumsu.length;

		System.out.println("평균은 : " + avg);
	}
}
