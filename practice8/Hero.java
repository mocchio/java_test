public class Hero {
  // フィールドの宣言
  String name; // 名前の宣言
  int hp; // HPの宣言
  
  // sleepメソッドの定義
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  // sitメソッドの定義
  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した！");
  }

  // slipメソッド（転ぶ）の定義
  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ!");
  }

  // runメソッド（逃げる）の定義
  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAME OVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}