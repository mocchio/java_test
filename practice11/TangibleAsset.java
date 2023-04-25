public abstract class TangibleAsset extends Asset implements Thing{
  // 有形資産クラス

  // フィールド
  String color;
  double weight;

  // コンストラクタ
  public abstract TangibleAsset(String name, int price, String color) {
    super(name, price)
    this.color = color;
  }

  // メソッド
  public String getColor() {
    return this.color;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}