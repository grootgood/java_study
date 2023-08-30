package java_study.chapter13.sec03;

public class SerializableWriter {

	public static void main(String[] args) {

		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;

		try {
			Serializer.save("C:/temp/Object2.data", classA);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
