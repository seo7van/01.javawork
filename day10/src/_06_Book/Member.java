package _06_Book;

public class Member {

	private String name;
	private int age;
	private String gender;
	
	Member() { }
	
	Member(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//이름 삽입
	void setName(String name) {
		this.name = name;
	}
	//이름 호출
	String getName() {
		return name;
	}
	
	//나이 삽입
	void setAge(int age) {
		this.age = age;
	}
	//나이 호출
	int getAge() {
		return age;
	}
	
	//성별 삽입
	void setGender(String gender) {
		this.gender = gender;
	}
	//성별 호출
	String getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender;
	}
	
}