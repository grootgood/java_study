package java_study.chapter05;

public class ArrayEx1 {

	public static void main(String[] args) {

//		int age;
//		System.out.println(age); //초기화 하지 않고 출력을 하면 에러 남. 

		double[] height = { 123.4, 234.2, 124.5 };
		double[] space = new double[500]; // 0으로 초기화
		char[] gender = { '남', '여', '남' };
		String[] space2 = new String[333]; // 으로 초기화

		System.out.println(space); // [D@3d012ddd
		// [는 배열을 의미, D는 엘리먼트타입(Double), @는 'at', 3d012ddd는 참조값
		System.out.println(space[0]); // 0.0
		System.out.println(space2); // [Ljava.lang.String;@123a439b
		System.out.println(space2[0]); // null -> 아무것도 가르키고 있지 않다, 참조하고 있는 것이 ㅇ벗다.

	}

}
