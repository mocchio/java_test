public abstract class TangibleAsset extends Asset{
  // 有形資産クラス

  // フィールド
  String color;

  // コンストラクタ
  public abstract TangibleAsset(String name, int price, String color) {
    super(name, price)
    this.color = color;
  }

  // メソッド
  public String getColor() {
    return this.color;
  }
}