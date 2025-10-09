package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		// じゃんけんの手を入力
		jyanken.getMyChoice();
		// 相手のじゃんけんの手が乱数で選ばれる
		jyanken.getRandom();
		// じゃんけんの結果を出力する
		jyanken.playGame();

	}

}
