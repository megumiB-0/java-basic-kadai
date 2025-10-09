package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//HashMap(じゃんけんの手キーrsp、値グーチョキパー)を宣言
	HashMap<String, String> hands = new HashMap<String, String>();

	//保持するデータを定義
	private String myChoice; //自分のrsp
	private String opponentChoice; //相手のrsp

	//じゃんけん表作成
	public void setJyanken() {
		//じゃんけんの表を追加　（キー,値）
		hands.put("r", "グー");
		hands.put("s", "チョキ");
		hands.put("p", "パー");
	}

	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		//入力案内
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう\n");
		//Scannerクラスの宣言
		Scanner scanner = new Scanner(System.in);
		// Scannerクラスで入力
		String input = scanner.next();
		// 入力を表示
		System.out.println(input);
		// 正しい手か判定
		if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {
			//正しければ、Scannerクローズ
			scanner.close();
			//じゃんけんクラスを実行するクラスに自分のじゃんけんの手を返す
			myChoice = input; //入力を保持
			return input;
		} else {
			//正しくなければ、エラーを出力し、再度じゃんけんの手を選ぶ
			System.out.println("入力エラー\nもう一度入力してください");
			return getMyChoice();
		}

	}

	// 相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {

		//2までの範囲で切り上げで数字(0,1,2)を選ぶ
		int num = (int) Math.floor(Math.random() * 3);
		//0:r,1:s,2:pを返す
		if (num == 0) {
			//0はr
			opponentChoice = "r";
		} else if (num == 1) {
			//1はs
			opponentChoice = "s";
		} else {
			//2(それ以外)はp
			opponentChoice = "p";
		}
		//		System.out.println(opponentChoice);

		return opponentChoice;
	}

	// じゃんけんを行うメソッド
	public void playGame() {
		// 自分と対戦相手のじゃんけんの手を入力する
		// じゃんけん表を呼び出す
		setJyanken();
		//自分の手（rsp）を日本語（グーチョキパー）に変換
		String myHand = hands.get(myChoice);
		//相手の手（rsp）を日本語（グーチョキパー）に変換
		String opponentHand = hands.get(opponentChoice);
		//相手と自分の手を出力
		System.out.println("自分の手は" + myHand + ",対戦相手の手は" + opponentHand);
		// 自分と対戦相手のじゃんけんの手を比較する
		// じゃんけんの結果を出力する
		if (myHand.equals("グー")) {
			if (opponentHand.equals("グー")) {
				System.out.println("あいこです");
			} else if (opponentHand.equals("チョキ")) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
		} else if (myHand.equals("チョキ")) {
			if (opponentHand.equals("グー")) {
				System.out.println("自分の負けです");
			} else if (opponentHand.equals("チョキ")) {
				System.out.println("あいこです");
			} else {
				System.out.println("自分の勝ちです");
			}

		} else {
			if (opponentHand.equals("グー")) {
				System.out.println("自分の勝ちです");
			} else if (opponentHand.equals("チョキ")) {
				System.out.println("自分の負けです");
			} else {
				System.out.println("あいこです");
			}
		}

	}

}
