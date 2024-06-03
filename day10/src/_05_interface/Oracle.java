package _05_interface;

public class Oracle implements DataAccess {


	@Override
	public void select() {
		System.out.println("Oracle을 검색합니다.");
	}

	@Override
	public void insert() {
		System.out.println("Oracle을 삽입합니다.");
	}

	@Override
	public void update() {
		System.out.println("Oracle을 수정합니다.");
	}

	@Override
	public void delete() {
		System.out.println("Oracle을 삭제합니다.");
	}

}