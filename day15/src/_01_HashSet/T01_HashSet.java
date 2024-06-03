package _01_HashSet;

import java.util.*;

class A{
	String str;

	public A() {	}
	public A(String str) {
		this.str = str;
	}
}

public class T01_HashSet {

	public static void main(String[] args) {

		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		A a1 = new A("JAVA");
		set2.add(a1);
		set2.add(new A("oracle"));
		set2.add(new A("sql"));
		set2.add(new A("react"));
		set2.add(new A("jsp"));
		
		int size = set2.size();
		System.out.println("저장된 객체의 갯수 : " + size);
		/*
		Iterator<A> i = set2.iterator();
		System.out.print("set2 출력 : ");
		while(i.hasNext()) {
			A ca = i.next();
			System.out.print(ca.str + " ");
		}
		System.out.println();
		*/
		// 출력시 계속 호출이 되도록 메소드로 구현
		iteratorPrint(set2.iterator());
		
		set2.add(new A("AWS"));
		iteratorPrint(set2.iterator());
		
		// 삭제 : oracle
		Iterator<A> i = set2.iterator();
		while(i.hasNext()) {
			A ca = i.next();
			String s = ca.str;
			if(s.equals("oracle")) {
				i.remove();        // 인자를 넣지 않아도 ca 하나만 호출한 거기 때문에 삭제 됨.
				//set2.remove(); 사용불가
			}
		}
		
	}
	
	static void iteratorPrint(Iterator<A> i) {
		while(i.hasNext()) {
			A ca = i.next();
			System.out.print(ca.str + " ");
		}
		System.out.println();
	}

}