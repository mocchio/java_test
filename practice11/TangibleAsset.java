public abstract class TangibleAsset {
  // 継承フィールド
  String name;
  int price;
  String color;

  // 継承コンストラクタ
  public abstract TangibleAsset(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;
  }

  // 継承メソッド
  public String getName() {
    return this.name;
  }
  public int getPrice() {
    return this.price;
  }
  public String getColor() {
    return this.color;
  }
}