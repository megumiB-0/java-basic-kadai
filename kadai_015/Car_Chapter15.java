package kadai_015;
//車クラスを作成
public class Car_Chapter15 {
//フィールド（ギアを定義）
//フィールド（速度を定義）
//初期値を宣言
private int gear= 1; //ギア1
private int speed= 10; //スピード10km/h

//メソッド（ギア変更）
public void changeGear(int afterGear) {
	System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
	gear = afterGear;//ギアの値の更新
	switch(gear) {
	case 1 -> speed = 10;
	case 2 -> speed = 20;
	case 3 -> speed = 30;
	case 4 -> speed = 40;
	case 5 -> speed = 50;
	default -> speed = 10;
};

};
//メソッド(ギアチェンジ後の速度を表示)
public void run() {
	System.out.println("速度は時速"+speed +"kmです");

}


}
