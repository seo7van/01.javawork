package _03_WildcardGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		/*
		Applicent<Person> ap = new Applicent<>(new Person());
		Applicent<Student> ap2 = new Applicent<>(new Worker());          // new Worker와 new Student는 사용 못함 
		Applicent<Student> ap3 = new Applicent<>(new HighStudent());                                                    
		*/
		// 모든 사람 신청 가능
		Course.registerCourse(new Applicent<Person>(new Person()));
		Course.registerCourse(new Applicent<Worker>(new Worker()));
		Course.registerCourse(new Applicent<Student>(new Student()));
		Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
		System.out.println("-------------------------------");
		
		// 학생만 신청가능
		//Course.registerCourse2(new Applicent<Person>(new Person()));  // 부모 안됨
		Course.registerCourse2(new Applicent<Student>(new Student()));
		Course.registerCourse2(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicent<MiddleStudent>(new MiddleStudent()));
		System.out.println("-------------------------------");
		
		// 직장인과 일반일만 신청가능
		Course.registerCourse3(new Applicent<Person>(new Person()));
		Course.registerCourse3(new Applicent<Worker>(new Worker()));      // worker와 그 부모만 가능
		//Course.registerCourse3(new Applicent<Student>(new Student()));  // super 사용으로 자식 안됨
		//Course.registerCourse2(new Applicent<HighStudent>(new HighStudent()));
		//Course.registerCourse2(new Applicent<MiddleStudent>(new MiddleStudent()));
		
				
	}
	
}