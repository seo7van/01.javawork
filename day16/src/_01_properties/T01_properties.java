package _01_properties;

import java.io.IOException;
import java.util.Properties;

public class T01_properties {

	public static void main(String[] args) {

		// properties : Map계열 => 키+값 세트 저장
		// HashMap과의 차이 : Properties에는 키 = String, 값 = String으로 담음
		// 					HashMap은 키와 값 상관 없이 원하는 자료형으로 담아도 됨
		
		Properties prop = new Properties();
		
		// value을 추가 할 때 
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");  //key값이 같으면 마지막 것을 덮어씀
		
		System.out.println(prop);
		
		// value을 얻어올 때
		// 2. getProperty(String key)
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("aaa"));   // key가 존재하지 않으면 null
		
		try {
			// 파일로 내보내기
			//prop.store(new FileOutputStream("test.properties"), "propertiesTest");		
			//prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}