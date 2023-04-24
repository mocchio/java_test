public class Main {
  public static void main(String[] args) {
    // Heroクラスのインスタンス生成
    Hero h = new Hero();
    // フィールドに初期値をセット
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
    // Heroクラスのメソッド呼び出し
    // h.sit(5);
    // h.slip();
    // h.sit(25);
    // h.run();

    // Matangoクラスのインスタンスを生成
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    // HeroクラスとMatangoクラスのメソッド呼び出し
    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}