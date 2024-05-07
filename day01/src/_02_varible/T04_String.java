package _02_varible;

public class T04_String {

	public static void main(String[] args) {
		String str1 = "801호";
		String str2 = "의료용 디지털 영상 표준활용";
		System.out.println(str1+" "+str2);

		//escape sequence(이스케이프 문자)
		/*
		 *역슬레시 하고 n하면  줄바꿈, 역슬레시 하고 t 하면 탭만큼 띄우기
		 */
		System.out.println("강의실 : 801호\n강좌명 : 의료용 디지털 영상 표준활용");
		System.out.println("강의실 : 801호\t강좌명 : 의료용 디지털 영상 표준활용");
		
		/*
		 * 강의실 : "801호"
		 * 강좌명 : "의료용 디지털 영상 표준활용"
		 */
		System.out.println("강의실 : \"801호\"ㅜn : \"의료용 디지털 영상 표준활용\"");
	}

}
