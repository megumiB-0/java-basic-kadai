package kadai_015;

public class CarExec_Chapter15 {
public static void main(String[] args) {
	// 車クラスのインスタンス（オブジェクト）を作成する	
	Car_Chapter15 car01 = new Car_Chapter15(1);
	// 車クラスのchangeGearメソッドを実行する
	car01.changeGear(3);
	// 車クラスのrunメソッドを実行する
	car01.run();
}
}