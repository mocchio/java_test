public class Wizard {
  // フィールドのアクセス制御
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  // メソッドのアクセス制御
  public void heal(Hero h) {
    int basePoint = 10; // 基本回復ポイント
    int recovPoint = (int)(basePoint * this.getWand.getPower); // 杖による回復ポイント
    h.setHp(h.getHp() + recovPoint); // 勇者のHPを回復する
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }

  // getterとsetterの設定
  public int getHp() { return this.hp; }
  public void setHp(int hp) { return this.hp = hp; }
  public int getMp() { return this.mp; }
  public void setMp(int mp) { return this.mp = mp; }
  public String getName() { return this.name; }
  public void setName(String name) { return this.name = name; }
  public Wand getWand() { return this.wand; }
  public void setHp(Wand wand) { return this.wand = wand; }
}