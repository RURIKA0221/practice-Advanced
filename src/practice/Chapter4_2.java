package practice;

import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap;

public class Chapter4_2 {

	public static void main(String[] args) {
		// HashMapを生成する場合(キーがInteger、値がString)
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// TreeMapを生成する場合(キー、値共にString)
		//Map<String, String> map2 = new TreeMap<String, String>();

		// 要素を追加する
		map1.put(0, "ぶどう");
		map1.put(3, "もも");

		// 登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		
		System.out.println(map1);//{0=マスカット, 3=もも}
		
		// 要素を取得する
		String str =map1.get(0); // マスカットを返す
		System.out.println(str);
		
		map1.get(1); // nullを返す
		
		// キーの存在チェック (trueを返す)
		map1.containsKey(0);

		// 値の存在チェック (falseを返す)
		map1.containsValue("ぶどう");
		
		map1.size(); // 2を返す
		
		// キーを指定して要素を削除する
		map1.remove(0); // 戻り値は"ぶどう"
		map1.remove(1); // 何もしない、戻り値はnull

		// キーと値を指定して要素を削除する
		map1.remove(3, "もも"); // 戻り値はtrue
		map1.remove(3, "なし"); // 何もしない、戻り値はfalse
		
		System.out.println(map1);//{}
	}

}
