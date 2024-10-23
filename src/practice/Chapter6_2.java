package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Chapter6_2 {

	public static void main(String[] args) {
		
		List<? extends Fruit> fruits; // 型パラメータとして、Fruitを継承したクラスを指定
		List<Apple> apples = new ArrayList<>();
		fruits = apples;// コンパイルエラーにならない
		
		List<? super Integer> wildCardIntList = new ArrayList<>();
		List<Number> numList = new ArrayList<>();
		wildCardIntList = numList; //OK
		//intList = numList; //コンパイルエラー
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro"); // OK
		map.put(2, "Hanako"); // OK
		//int value = map.get(0); // コンパイルエラー
		
		Set<Integer> set = new HashSet<>();
		set.add(1); // OK
		//set.add("Two"); // コンパイルエラー
	}
}
