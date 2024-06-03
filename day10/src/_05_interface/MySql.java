package _05_interface;

public class MySql implements DataAccess {


	@Override
	public void select() {
		System.out.println("MySql을 검색합니다.");
	}

	@Override
	public void insert() {
		System.out.println("MySql을 삽입합니다.");
	}

	@Override
	public void update() {
		System.out.println("MySql을 수정합니다.");
	}

	@Override
	public void delete() {
		System.out.println("MySql을 삭제합니다.");
	}


}