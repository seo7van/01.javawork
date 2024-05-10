package _02_varible;

public class T04_String {

	public static void main(String[] args) {
		String str1 = "801호";
		String str2 = "의료용 디지털 영상 표준활용";
		System.out.println(str1+" "+str2);

//		escape sequence(이스케이프 문자) 어려우면 문자보다 먼저 한다고 생각하자
		
/*	\ + 여러 문자 조합으로 특수 기능 수행 가능 (그대신 출력했을 때)
		 \n : 줄바꿈
		 \t : 탭만큼 띄우기
		 \" : 쌍따옴표 출력(=본문 자체 쌍따옴표가 있다랑 같은 말)
		 \\ : 역슬래쉬 출력*/

		System.out.println("강의실 : 801호\n강좌명 : 의료용 디지털 영상 표준활용");
		System.out.println("강의실 : 801호\t강좌명 : 의료용 디지털 영상 표준활용");
		
/*      ex)강의실 : "801호"
	   	        강좌명 : "의료용 디지털 영상 표준활용" */
	   	        System.out.println("강의실 : \"801호\"\n강좌명 : \"의료용 디지털 영상 표준활용\"");
		   
/*		ex)이름 : "최서진"		   
                 나이 : "26세"
                 성별 : "여성" */
		                   System.out.println("이름 : \"최서진\"\n나이 : \"26세\"\n성별 : \"여성\"");
		   
		   
		   
	}

}
