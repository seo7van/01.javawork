package _01_HashSet;

import java.util.*;

class Member {

	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return age == member.age && name.equals(member.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;   //Objects.hash(age, name); 같은 역할 수행
	}
	
}

public class T03_HashSet {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));    // 둘의 주소는 다름
		
		System.out.println("size : " + set.size());
		for(Member element : set) {  // for문 비효율적
			// System.out.println(element);  //hashCode를 오버라이딩하면 1개, 안하면 2개 출력
			System.out.println(element.name + ", " + element.age);
		}
		
	}
}