public abstract class Asset {
  // 資産クラス

  // 継承フィールド
  String name;
  int price;

  // コンストラクタ
  public abstract Asset(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // 継承メソッド
  public String getName() {
    return this.name;
  }
  public int getPrice() {
    return this.price;
  }
}