// 직렬화가 가능한 클래스
package java_study.chapter13.sec03;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB();

	// 아래는 직렬화에서 제외
	static int field3;
	transient int field4;
}
