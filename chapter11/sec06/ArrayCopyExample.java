package java_study.chapter11.sec06;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

//----------------------복사본 배열이 새로 만들어지는 방법---------------------
		// 방법 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));

		// 방법 2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));

//-------------------기존 배열에서 복사--------------------------------
		// 방법 3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	}
}
