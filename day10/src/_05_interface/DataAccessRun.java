package _05_interface;

abstract public class DataAccessRun {
	
	public static void main(String[] args) {

		Oracle oracle = new Oracle();
		oracle.select();
		oracle.insert();
		oracle.update();
		oracle.delete();
		System.out.println();
		
		DataAccess data = oracle;
		data.delete();
		System.out.println();
		
		data = new MySql();
		data.select();
		data.insert();
		data.update();
		data.delete();
		
		
	}

}