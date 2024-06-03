package _02_ArrayList;

import java.util.*;

public class T02_ArrayList {

	public static void main(String[] args) {
		
		// 제네릭<>을 삽입하지 않고 사용할 수 있음
		//  -> 권장하지 않음
		// 매개변수에 어떠한 객체라도 받겠다는 의미
		ArrayList list = new ArrayList();
		
		list.add(1);       
		list.add(45.67);  
		list.add("6");       
		list.add(Integer.valueOf(7));  
		list.add(new String("98"));
		
		Object obj = list.get(0);         // 부모의 자료로 형변환
		
		int num1 = (int)list.get(0);
		double dou = (double)list.get(1);
		int num2 = Integer.parseInt((String)list.get(2));
		int num3 = (int)list.get(3);
		int num4 = Integer.parseInt((String)list.get(4));
		
		System.out.println("합계 : " + (num1+dou+num2+num3+num4));
		
	}

}