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
  public void setHp(int hp) {
    if (hp < 0) {
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }

  public int getMp() { return this.mp; }
  public void setMp(int mp) {
    if (mp < 0) {
      throw new IllegalArgument Exception
      ("MPは0以上でなければいけない");
    }
    this.mp = mp;
  }

  public String getName() { return this.name; }
  public void setName(String name) {
    if ( name == null || name.length < 3) {
      throw new IllegalArgument Exception
      ("魔法使いの名前が異常です");
    }
    this.name = name;
  }

  public Wand getWand() { return this.wand; }
  public void setHp(Wand wand) {
    if (wand == null) {
      throw new IllegalArgument Exception
      ("杖は必ず装備しなければならない");
    }
    this.wand = wand;
  }
}