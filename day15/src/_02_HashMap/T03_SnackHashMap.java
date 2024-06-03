package _02_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class T03_SnackHashMap {

	public static void main(String[] args) {

		Map<String, Snack> map = new HashMap<String, Snack>();
	
		map.put("포카칩", new Snack("어니언맛", 345));
		map.put("홈런볼", new Snack("초코맛", 416));
		map.put("알새우칩", new Snack("새우맛", 317));
		map.put("초코송이", new Snack("초코맛", 445));
		System.out.println(map);
		
		// 키값이 있으면 값을 덮어쓰기, 키값이 없으면 넣기
		map.put("포카칩", new Snack("오리지널", 309));
		System.out.println(map);
		
		// repalce 키에 해당하는 값 변경(키가 없으면 아무것도 하지 않음)
		map.replace("홈런볼", new Snack("화이트초코맛", 382));
		System.out.println(map);
		System.out.println("----------------------------------------------------------------------");
		
		// 1) Iterator에서 사용하려면 Map => Set => Iterator
		// 1. Map => Set으로 변경
		Set<String> KeySet = map.keySet();  // <String> 미리 넣어주면 나중에 타입 변환하지 않아도 됨
		
		// 2.Set => Iterator에 담기
		Iterator<String> itKey = KeySet.iterator();  // <String> 미리 넣어주면 나중에 타입 변환하지 않아도 됨
		
		// 3. Iterator를 돌면서 출력
		while(itKey.hasNext()) {
			String key = itKey.next();    // 타입을 넣지 않으면 객체 타입. (String)itKey.next()로 형변환 해줘야 함
			Snack value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("----------------------------------------------------------------------");
		
		// 2) Entryset() 이용하는 방법
		//     *제네릭을 안넣고 사용
		Set entrySet = map.entrySet();  // 키+값 세트의 집합
		Iterator itEntry = entrySet.iterator();
		
		while(itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next();
			
			// Entry = key+value이 있는 엔트리 타입
			String key = (String)entry.getKey();   // Entry중에서 key만 얻어옴. key는 String타입
			Snack value = (Snack)entry.getValue();
			
			System.out.println(key + " / " + value);
		} // 제네릭에 형을 넣지 않으면 형변환 필수
		System.out.println("----------------------------------------------------------------------");
		
		/*
		 * 제네릭을 넣으려면 매개변수는 1개만 넣어야 함
		   Set<String, Snack> e = map.entrySet();   // 오류. Set(1개의 매개변수)
			
		 * 아래처럼 사용해야 됨
		   Set<Entry<String, Snack>> e = map.entrySet();  // 두 개를 받아오려면 Entry메소드를 사용하면 됨
		*/
		
		//   *제네릭을 넣고 사용
		Set<Entry<String, Snack>> entrySet2 = map.entrySet();
		Iterator<Entry<String, Snack>> itEntry2 = entrySet2.iterator();
		
		while(itEntry2.hasNext()) {
			Entry<String, Snack> entry = itEntry2.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println(key + " - " + value);
		}
		
		
		
	}

}