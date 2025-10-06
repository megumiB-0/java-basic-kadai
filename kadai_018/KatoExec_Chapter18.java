package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// 子クラスのオブジェクトを作る
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();

		// setGivenNameメソッドを実行する
		taro.setGivenName();
		// execIntroduceメソッドを実行する
		taro.execIntroduce();

		// setGivenNameメソッドを実行する
		ichiro.setGivenName();
		// execIntroduceメソッドを実行する
		ichiro.execIntroduce();

		// setGivenNameメソッドを実行する
		hanako.setGivenName();
		// execIntroduceメソッドを実行する
		hanako.execIntroduce();
	}

}
