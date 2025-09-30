package kadai_015;
//車クラスを作成
public class Car_Chapter15 {
//フィールド（ギアを定義）
//フィールド（速度を定義）
//変数を宣言
private int gear; //ギア
private int speed; //スピード

//get
private int getGear() {
	return gear;
}	
private int getSpeed(int gear) {
	//初期ギアによって速度決定
	switch(gear) {
	case 1 -> speed = 10;
	case 2 -> speed = 20;
	case 3 -> speed = 30;
	case 4 -> speed = 40;
	case 5 -> speed = 50;
	default -> speed = 10;
};
	return speed;
}
//set
private void setGear() {
	this.gear =gear;
}	
private void setSpeed() {
	this.speed=speed;
}
//メソッド（ギア変更）
public void changeGear(int afterGear) {
	getSpeed(afterGear);
System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
};
//メソッド(ギアチェンジ後の速度を表示)
public void run() {
	 System.out.println("速度は時速"+speed +"kmです");
}

//コンストラクタ
Car_Chapter15(int gear){
	this.gear = gear;
}


	
}
