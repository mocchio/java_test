public class Wizard {
  // フィールドのアクセス制御
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  // メソッドのアクセス制御
  public void heal(Hero h) {
    int basePoint = 10; // 基本回復ポイント
    int recovPoint = (int)(basePoint * this.wond.power); // 杖による回復ポイント
    h.setHp(h.getHp() + recovPoint); // 勇者のHPを回復する
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }
}