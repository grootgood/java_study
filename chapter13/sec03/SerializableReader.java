package java_study.chapter13.sec03;

public class SerializableReader {
	public static void main(String[] args) {
		try {
			ClassA v = (ClassA) Serializer.load("C:/temp/Object.data"); // Object -> ClassA 변환 : Down casting

			System.out.println("field1 : " + v.field1);
			System.out.println("field2.field1 : " + v.field2.field1);

			System.out.println("field1 : " + v.field3);
			System.out.println("field1 : " + v.field4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
