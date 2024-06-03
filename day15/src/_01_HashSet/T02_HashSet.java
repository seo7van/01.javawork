package _01_HashSet;

import java.util.*;

public class T02_HashSet {

	public static void main(String[] args) {
		/*
		String[] inte = {"1", "23"};     // 보통 int보다 String을 자주 사용.
		Set set1 = new HashSet();
		
		set1.add(inte[0]);
		iteratorPrint(set1.iterator());
		*/		
		Object[] objArr = {"1", Integer.valueOf(1), "2", "2", "2", "3", "3", "4", "4", "4"};
		Set set1 = new HashSet();
		
		set1.add(objArr[0]);
		set1.add(objArr[1]);
		set1.add(objArr[2]);
		
		for(Object obj : objArr) {
			set1.add(obj);
		}
		System.out.println(set1);
		
		set1.clear();
		System.out.println("set1의 size : " + set1.size());
		
		// iteratorPrint(set1.iterator());
		
	}
	/*
	static void iteratorPrint(Iterator<String> i) {
		while(i.hasNext()) {
			String ca = i.next();
			System.out.println(ca + " ");   // String은 오버라이딩 되어 있기 때문에 .str을 붙이지 않아도 됨
		}
		System.out.println();
	}
	*/
	static void iteratorPrint(Iterator<Object> i) {
		while(i.hasNext()) {
			Object ca = i.next();
			System.out.println(ca + " ");   
		}
		System.out.println();
	}
}