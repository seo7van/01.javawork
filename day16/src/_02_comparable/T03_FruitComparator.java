package _02_comparable;

import java.util.*;

public class T03_FruitComparator {

	public static void main(String[] args) {

		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitDescending());
		
		treeSet.add(new Fruit("grape", 4500));
		treeSet.add(new Fruit("watermelon", 9000));
		treeSet.add(new Fruit("strawberry", 10000));
		
		Iterator<Fruit> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Fruit fruit = iter.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}

	}

}