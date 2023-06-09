public class Wand {
  private String name;
  private double power;
  
  // getterとsetterの設定
  public String getName() { return this.name; }
  public void setName(String name) {
    if ( name == null || name.length() < 3) {
      throw new IllegalArgument Exception
      ("杖の名前が異常です");
    }
    this.name = name;
  }

  public double getPower() { return this.power; }
  public void setPower(double power) {
    if (power < 0.5 || power > 100.0) {
      throw new IllegalArgument Exception
      ("杖による魔力が異常です");
    }
    this.power = power;
  }
}