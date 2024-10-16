package practice;

import java.util.ArrayList;
import java.util.List;

public class Chapter4_1 {

	public static void main(String[] args) {
		// ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();

		// LinkedListを生成する場合
		//List<Integer> list2 = new LinkedList<Integer>();
			
		// 要素を追加する
		list1.add("りんご");
		list1.add("みかん");

		// 位置を指定して要素を追加する
		list1.add(1, "バナナ");
		
		System.out.println(list1);//りんご,バナナ,みかん
		
		// 要素を取得する
		String item = list1.get(0);
		System.out.println(item);
		
		// 存在チェック (trueを返す)
		Boolean boolean1 =list1.contains("バナナ");
		System.out.println(boolean1);

		// 存在チェック (falseを返す)
		Boolean boolean2 = list1.contains("なし");
		System.out.println(boolean2);
		
		int size =list1.size(); // 3を返す
		System.out.println(size);
		
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		list1.remove("バナナ"); // 戻り値はtrue
		list1.remove("なし"); // 何もしない、戻り値はfalse

		// 位置を指定して要素を削除する
		list1.remove(0); //戻り値は"りんご"
		
		System.out.println(list1);//みかん
		
	}

}
