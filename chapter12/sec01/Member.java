package java_study.chapter12.sec01;

import java.util.Objects;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	public boolean equals(Object obj) {
//		if (obj instanceof Member) {
//			Member member = (Member) obj;
//			return member.name.equals(name) && (member.age == age);
//		} else {
//			return false;
//		}
//	}
//
//	public int hashCode() {
//		return name.hashCode() + age;
//	}

//	eclips에서 자동으로 만들어주는 HashCode()와 equals() 
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}
