package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	// HashMapを宣言
	static HashMap<String, String> dictionaryMap = new HashMap<String, String>();

	//辞書作成
	public static void setDictionary() {

		// 10この英単語と意味を追加
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear", "梨");
		dictionaryMap.put("kiwi", "キウイ");
		dictionaryMap.put("strawberry", "いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
	}

	// 初期値定義
	String[] wordArray = {};

	// 英単語の数だけ繰り返し辞書を調べる
	public static void checkDictionary(String[] wordArray) {

		// 英単語の数だけ繰り返す
		for (String word : wordArray) {
			// 辞書に追加されている場合
			if (dictionaryMap.containsKey(word)) {
				// 調べた結果を出力
				String value = dictionaryMap.get(word);
				System.out.println(word + "の意味は" + value);
				// 辞書に追加されていない場合
			} else {
				// 辞書に存在していない旨出力			
				System.out.println(word + "は辞書に存在しません");
			}

		}
	}

}
