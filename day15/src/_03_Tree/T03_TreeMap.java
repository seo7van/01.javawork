package _03_Tree;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class T03_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		treeMap.put("apple", 1000);
		treeMap.put("banana", 3000);
		treeMap.put("cherry", 2000);
		treeMap.put("dragon fruit", 5000);
		treeMap.put("eggfruit", 4500);
		treeMap.put("grape", 5500);
		treeMap.put("mango", 2500);
		treeMap.put("orange", 4000);
		treeMap.put("peach", 3500);
		treeMap.put("watermelon", 9000);

		System.out.println("[c~n 사이의 단어 검색]");
		NavigableMap<String, Integer> naviMap = treeMap.subMap("c", true, "n", true);
		//System.out.println(naviMap);
		for(Entry<String, Integer> entry : naviMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		
		
	}
	

}