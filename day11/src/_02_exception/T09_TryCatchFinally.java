package _02_exception;

public class T09_TryCatchFinally {

	public static void main(String[] args) {
		
		/*
		try {
			
		} catch() {
			
		} finally {
			
			 * 예외와 상관없이 실행
			 
		}
		출력문(try와 catch문에 return이 있으면 실행되지 않음)
		*/
		try {
			System.out.println(args.length);
			System.out.println(args[0]);
			System.out.println(args[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 범위를 넘어섬");
		} finally {
			System.out.println("프로그램 종료");
		}
		
	}
}