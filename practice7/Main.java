public class Main {
  public static void main(String[] args) {
    // Heroクラスのインスタンス生成
    Hero h = new Hero();
    // フィールドに初期値をセット
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました！");
    // Heroメソッドの呼び出し
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
  }
}