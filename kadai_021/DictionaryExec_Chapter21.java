package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter21 dictionary_Chapter21 = new Dictionary_Chapter21();
		setDictionary();
		// 調べる単語を配列にセット
		String[] wordArray = { "apple", "banana", "grape", "orange" };
		// 辞書を調べるメソッドを引数指定で呼び出す
		checkDictionary(wordArray);
	}

}
