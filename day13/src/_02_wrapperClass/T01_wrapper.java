package _02_wrapperClass;

public class T01_wrapper {

	public static void main(String[] args) {

		// deprecated : 앞으로 없어질 가능성이 있는 것. 되도록이면 쓰지 마시오
		Integer ii = new Integer(3);
		Integer i = Integer.valueOf(3);
		Integer i2 = Integer.valueOf(100);
		/*
		compareTo()
			0 : 비교해서 같으면 0
			1 : 문자열이면 사전순의 반대(숫자도 같음)
		   -1 : 문자열의 사전순일 때
		*/
		System.out.println(i.compareTo(i2));
		
		int result = i;
		String result2 = i.toString(); //i.toString()의 반환형은 String.
		System.out.println("result = " + result+3);
		System.out.println("result = " + i.toString());
		
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("size : " + Integer.SIZE +  "bit");
		System.out.println("bytes : " + Integer.BYTES + "bytes");
		System.out.println("type : " + Integer.TYPE);

	}

}