package java_study.chapter11.sec01;

public class Member {
	public String id;
	public int age;

	public Member(String id, int age) {
		super();
		this.id = id;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // 매개값이 Member 타입인지 확인
			Member member = (Member) obj; // 타입 변환 후 (Downcasting)
			if (id.equals(member.id) && age == member.age) { // id 필드와 member 필드 동일 여부 확인
				return true;
			}
		}
		return false;
	}
}
