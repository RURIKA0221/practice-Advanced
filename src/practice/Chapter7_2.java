package practice;

public class Chapter7_2 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Thread t = new Thread
			// 上記の無名クラス
			(new Runnable() {
				// ★この中で無名の子クラスを用意しているイメージ
				// Runnableクラスの runメソッドをオーバーライドします。
				@Override
				// メインプログラムが mainメソッドから始まるのに対して、
				// スレッドは runメソッドから始まる
				// runメソッド内にはスレッドにさせたい自由な処理を記述できます。
				public void run() {
					System.out.println("無名クラスのテスト");
				}
			});
			//スレッドを起動している
			t.start();
		}

	}

}
