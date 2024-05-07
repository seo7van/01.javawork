package _02_varible;

public class T01_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//컨트롤 쉬프트 슬레쉬 가 단축키
		// /*의 단측키는 
		/*byte(1byte)char(2bt*/
		int num1;
		int num2 = 10;
		
		num1=11;
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num1+num2);
		System.out.println(num1*2+num2);
		
		int sum = num1 + num2;
		System.out.println("num1+num2="+sum);
		// 변수를 하나 만들어 sum + 5 를 한 결과를 넣으시오. 그리고 출력하시오
		
		int num3 = sum + 5;
		System.out.println(num3);
		
		long long01 = 50000000000000L;
		//L자를 안붙히면 int형으로 인식한다
		
		double doub01 = 37.12516541564135523;
		System.out.println(doub01);
		double doub02 = 78.5415;
		System.out.println(doub01+doub02);
		// 기본 자료형 8바이트를  f1oat 4byte에 (큰자료형을 작은 자료형에) 넣어서 오류남
		float float01 = 45.829384723f;
		
	}

}
