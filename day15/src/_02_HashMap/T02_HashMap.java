package _02_HashMap;

import java.util.*;

public class T02_HashMap {

	public static void main(String[] args) {

		// 사용자의 id(키)와 pw(값)을 hashMap에 저장 (데이터 3개)
		HashMap<String, String> map = new HashMap<String, String>();
					   //숫자를 넣어도 Integer보다 String을 사용하는 것이 좋음
		map.put("myId", "1234");
		map.put("myId2", "1111");
		map.put("myId3", "2222");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 사용자로부터 id와 pw를 받아서
			System.out.print("아이디와 비밀번호를 입력하세요 : ");	
			String id = sc.next();
			String pw = sc.next();
			
			// 1. id가 없으면 : 입력한 id는 없습니다. 다시 수행
			if(map.containsKey(id) == false) {  //map.get(id) == id
				System.out.println("입력한 id는 없습니다. 다시 입력해주세요.");
			}
			// 2. pw가 맞지 않으면 : pw가 맞지 않습니다. 다시 수행
			else if(!(map.get(id).equals(pw))) {
				System.out.println("pw가 맞지 않습니다. 다시 입력해주세요.");
			}
			// 3. id와 pw가 맞으면 종료
			else {
				System.out.println("로그인 되었습니다.");
				break;
			}
			
			
		}
		
		sc.close();
		
	}

}