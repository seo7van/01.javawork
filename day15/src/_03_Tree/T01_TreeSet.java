package _03_Tree;

import java.util.TreeSet;

public class T01_TreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 가장 낮은 점수
		System.out.println(scores.first());
		
		// 가장 높은 점수
		System.out.println(scores.last());
		
		// 95점보다 낮은 점수
		System.out.println("95점 바로 아래 점수 : " + scores.lower(95));
		
		// 95점 바로 위의 점수 
		System.out.println("95점 바로 위 점수 : " + scores.higher(95));
	
		// 95점 이거나 없으면 바로 아래점수
		System.out.println("95점이거나 없으면 바로 아래 점수 : " + scores.floor(95));
	
		// 95점 이거나 없으면 바로 위점수
		System.out.println("95점이거나 없으면 바로 위 점수 : " + scores.ceiling(95));
	
		// 들어있는 객체 수 
		System.out.println("들어있는 객체 수 : " + scores.size());
	
		while(!scores.isEmpty()) {
			scores.pollFirst();
			System.out.println("남아있는 객체 수 : " + scores.size());
		}
		
	}
	

}