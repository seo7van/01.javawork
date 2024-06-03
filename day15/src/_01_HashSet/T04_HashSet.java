package _01_HashSet;

import java.util.*;

public class T04_HashSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();  // 제네릭에 하나만 넣어도 나머지에 자동으로 입력됨
		
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45)+1);
		}
		System.out.println(set);
		
		set.clear();
		
		for(int i=0; i<6; i++) {  
			set.add((int)(Math.random() * 45)+1);
		}										// 이렇게 사용하면 안됨. 왜냐하면 중복저장?
		System.out.println(set);
		
		// set은 순서가 없어 정렬하지 못함
		// 정렬을 하려면 List로 변환해야 함
		List list = new ArrayList(set);   //Vector, LinkedList 사용 방법이 똑같기 때문에 모두 사용 가능
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	
}