package java_study.chapter11.sec06;

public class Member implements Comparable<Member> {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	} // return -name.compareTo(o.nane); -> 역순으로 정렬

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
}
