package _02_conditional;

public class T04_overlap {

	public static void main(String[] args) {
		//		if문 안에 if문을 중첩으로 넣음
/*		
      if(조건식1){
			   if(조건식2) {
			       조건식2가 참일때 실행
			                    }else {
			                    조건식2가 거짓일때 실행
			       }
			       }else {
			       if(조건식3) {
			       조건식3이 참 일 때 실행
			       }else{
			       조건식3이 거짓일 때 실행
			       }
	    }
*/
		int num1 = 150;
		
		if(num1>100) {
			if(num1>200) {
				System.out.println("200보다 큰 수");
		} else { //101~200
			System.out.println("101~200 사이의 숫자");
		}
	}
	else { //100~음수 모두다
			if(num1<0) {
				System.out.println("음수");
			}else {//0~100
				System.out.println("0~100 사이의 숫자");
			}
		}
	}

}
