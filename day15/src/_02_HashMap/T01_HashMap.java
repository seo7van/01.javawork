package _02_HashMap;

import java.util.*;

public class T01_HashMap {

	public static void main(String[] args) {

		// Map을 넣어줘도 상관 없음
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("아무개", 95);    //add사용X
		/*
		map.put("아무개", 90);
		map.put("아무개", 85);
		map.put("아무개", 67);    //key값이 똑같은면 하나로 인식
		*/
		map.put("홍길동", 58);
		map.put("이소영", 85);
		map.put("최서진", 100);
		System.out.println("size : " + map.size());
		
		// get(키) : 결과는 값이 리턴됨
		System.out.println("홍길동의 점수 : " + map.get("홍길동"));
		
		System.out.println(map);
		
		// remove(키) : 객체 삭제
		map.remove("이소영");
		System.out.println(map);
		
		
		
	}

}