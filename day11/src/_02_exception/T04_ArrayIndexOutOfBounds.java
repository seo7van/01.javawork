package _02_exception;

public class T04_ArrayIndexOutOfBounds {
	
	public static void main(String[] args) {
		/*
		String[] str = {"abc", "def", "ghi"};
		str[3] = "kim";
		*/
		try {
			String[] str = {"abc", "def", "ghi"};
			str[3] = "kim";
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 초과했습니다.");
			e.printStackTrace();
		}
	}
	
}