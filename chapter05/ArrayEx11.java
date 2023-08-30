// 8.7

package java_study.chapter05;

public class ArrayEx11 {

	public static void main(String[] args) {

//		int[] jumsu = new int[10000];
//		Random r = new Random(5); // 여기서 5는 seed 값이라고 함.
//		for (int i = 0; i < jumsu.length; i++) {
//			jumsu[i] = r.nextInt(331); // 0~330
//		}

		// jumsu는 'return data'에서 참조값을 return 값으로 받음
		int[] jumsu = ArrayUtil.getRandomArray(10000, 331);

		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				count++;
				System.out.println(count + ": 만점자 번호는 " + i + "번");
			}
		}
		System.out.println("전체 만점자 수는 " + count + "명");
	}

}
