package java_study.chapter06.sec04;

public class BuildHouse {

	public static void main(String[] args) {

		Block bl1 = new Block();
		bl1.x = 50;
		bl1.y = 50;
		bl1.color = "회색";
		System.out.println(bl1);

		Block bl2 = new Block();
		bl2.x = 150;
		bl2.y = 150;
		bl2.color = "파랑색";
		System.out.println(bl2);

		bl1.put();
	}
}
